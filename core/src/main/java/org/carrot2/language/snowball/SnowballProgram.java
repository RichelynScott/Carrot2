/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2025, Dawid Weiss, Stanisław Osiński.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * https://www.carrot2.org/carrot2.LICENSE
 */
package org.carrot2.language.snowball;

import org.carrot2.math.mahout.Arrays;

/**
 * This is the rev 502 of the Snowball SVN trunk, now located at <a target="_blank"
 * href="https://github.com/snowballstem/snowball/tree/e103b5c257383ee94a96e7fc58cab3c567bf079b">GitHub</a>,
 * but modified:
 *
 * <ul>
 *   <li>made abstract and introduced abstract method stem to avoid expensive reflection in filter
 *       class.
 *   <li>refactored StringBuffers to StringBuilder
 *   <li>uses char[] as buffer instead of StringBuffer/StringBuilder
 *   <li>eq_s,eq_s_b,insert,replace_s take CharSequence like eq_v and eq_v_b
 *   <li>use MethodHandles and fix <a target="_blank"
 *       href="http://article.gmane.org/gmane.comp.search.snowball/1139">method visibility bug</a>.
 * </ul>
 */
public abstract class SnowballProgram {

  protected SnowballProgram() {
    current = new char[8];
    setCurrent("");
  }

  public abstract boolean stem();

  /** Set the current string. */
  public void setCurrent(String value) {
    current = value.toCharArray();
    cursor = 0;
    limit = value.length();
    limit_backward = 0;
    bra = cursor;
    ket = limit;
  }

  /** Get the current string. */
  public String getCurrent() {
    return new String(current, 0, limit);
  }

  /**
   * Set the current string.
   *
   * @param text character array containing input
   * @param length valid length of text.
   */
  public void setCurrent(char text[], int length) {
    current = text;
    cursor = 0;
    limit = length;
    limit_backward = 0;
    bra = cursor;
    ket = limit;
  }

  /**
   * Get the current buffer containing the stem.
   *
   * <p>NOTE: this may be a reference to a different character array than the one originally
   * provided with setCurrent, in the exceptional case that stemming produced a longer intermediate
   * or result string.
   *
   * <p>It is necessary to use {@link #getCurrentBufferLength()} to determine the valid length of
   * the returned buffer. For example, many words are stemmed simply by subtracting from the length
   * to remove suffixes.
   *
   * @see #getCurrentBufferLength()
   */
  public char[] getCurrentBuffer() {
    return current;
  }

  /**
   * Get the valid length of the character array in {@link #getCurrentBuffer()}.
   *
   * @return valid length of the array.
   */
  public int getCurrentBufferLength() {
    return limit;
  }

  // current string
  private char current[];

  protected int cursor;
  protected int limit;
  protected int limit_backward;
  protected int bra;
  protected int ket;

  protected void copy_from(SnowballProgram other) {
    current = other.current;
    cursor = other.cursor;
    limit = other.limit;
    limit_backward = other.limit_backward;
    bra = other.bra;
    ket = other.ket;
  }

  protected boolean in_grouping(char[] s, int min, int max) {
    if (cursor >= limit) return false;
    char ch = current[cursor];
    if (ch > max || ch < min) return false;
    ch -= min;
    if ((s[ch >> 3] & (0X1 << (ch & 0X7))) == 0) return false;
    cursor++;
    return true;
  }

  protected boolean in_grouping_b(char[] s, int min, int max) {
    if (cursor <= limit_backward) return false;
    char ch = current[cursor - 1];
    if (ch > max || ch < min) return false;
    ch -= min;
    if ((s[ch >> 3] & (0X1 << (ch & 0X7))) == 0) return false;
    cursor--;
    return true;
  }

  protected boolean out_grouping(char[] s, int min, int max) {
    if (cursor >= limit) return false;
    char ch = current[cursor];
    if (ch > max || ch < min) {
      cursor++;
      return true;
    }
    ch -= min;
    if ((s[ch >> 3] & (0X1 << (ch & 0X7))) == 0) {
      cursor++;
      return true;
    }
    return false;
  }

  protected boolean out_grouping_b(char[] s, int min, int max) {
    if (cursor <= limit_backward) return false;
    char ch = current[cursor - 1];
    if (ch > max || ch < min) {
      cursor--;
      return true;
    }
    ch -= min;
    if ((s[ch >> 3] & (0X1 << (ch & 0X7))) == 0) {
      cursor--;
      return true;
    }
    return false;
  }

  protected boolean in_range(int min, int max) {
    if (cursor >= limit) return false;
    char ch = current[cursor];
    if (ch > max || ch < min) return false;
    cursor++;
    return true;
  }

  protected boolean in_range_b(int min, int max) {
    if (cursor <= limit_backward) return false;
    char ch = current[cursor - 1];
    if (ch > max || ch < min) return false;
    cursor--;
    return true;
  }

  protected boolean out_range(int min, int max) {
    if (cursor >= limit) return false;
    char ch = current[cursor];
    if (!(ch > max || ch < min)) return false;
    cursor++;
    return true;
  }

  protected boolean out_range_b(int min, int max) {
    if (cursor <= limit_backward) return false;
    char ch = current[cursor - 1];
    if (!(ch > max || ch < min)) return false;
    cursor--;
    return true;
  }

  protected boolean eq_s(int s_size, CharSequence s) {
    if (limit - cursor < s_size) return false;
    int i;
    for (i = 0; i != s_size; i++) {
      if (current[cursor + i] != s.charAt(i)) return false;
    }
    cursor += s_size;
    return true;
  }

  protected boolean eq_s_b(int s_size, CharSequence s) {
    if (cursor - limit_backward < s_size) return false;
    int i;
    for (i = 0; i != s_size; i++) {
      if (current[cursor - s_size + i] != s.charAt(i)) return false;
    }
    cursor -= s_size;
    return true;
  }

  protected boolean eq_v(CharSequence s) {
    return eq_s(s.length(), s);
  }

  protected boolean eq_v_b(CharSequence s) {
    return eq_s_b(s.length(), s);
  }

  protected int find_among(Among v[], int v_size) {
    int i = 0;
    int j = v_size;

    int c = cursor;
    int l = limit;

    int common_i = 0;
    int common_j = 0;

    boolean first_key_inspected = false;

    while (true) {
      int k = i + ((j - i) >> 1);
      int diff = 0;
      int common = common_i < common_j ? common_i : common_j; // smaller
      Among w = v[k];
      int i2;
      for (i2 = common; i2 < w.s_size; i2++) {
        if (c + common == l) {
          diff = -1;
          break;
        }
        diff = current[c + common] - w.s[i2];
        if (diff != 0) break;
        common++;
      }
      if (diff < 0) {
        j = k;
        common_j = common;
      } else {
        i = k;
        common_i = common;
      }
      if (j - i <= 1) {
        if (i > 0) break; // v->s has been inspected
        if (j == i) break; // only one item in v

        // - but now we need to go round once more to get
        // v->s inspected. This looks messy, but is actually
        // the optimal approach.

        if (first_key_inspected) break;
        first_key_inspected = true;
      }
    }
    while (true) {
      Among w = v[i];
      if (common_i >= w.s_size) {
        cursor = c + w.s_size;
        if (w.method == null) return w.result;
        boolean res;
        try {
          res = (boolean) w.method.invokeExact(this);
        } catch (RuntimeException | Error e) {
          throw e;
        } catch (Throwable e) {
          throw new RuntimeException(e);
        }
        cursor = c + w.s_size;
        if (res) return w.result;
      }
      i = w.substring_i;
      if (i < 0) return 0;
    }
  }

  // find_among_b is for backwards processing. Same comments apply
  protected int find_among_b(Among v[], int v_size) {
    int i = 0;
    int j = v_size;

    int c = cursor;
    int lb = limit_backward;

    int common_i = 0;
    int common_j = 0;

    boolean first_key_inspected = false;

    while (true) {
      int k = i + ((j - i) >> 1);
      int diff = 0;
      int common = common_i < common_j ? common_i : common_j;
      Among w = v[k];
      int i2;
      for (i2 = w.s_size - 1 - common; i2 >= 0; i2--) {
        if (c - common == lb) {
          diff = -1;
          break;
        }
        diff = current[c - 1 - common] - w.s[i2];
        if (diff != 0) break;
        common++;
      }
      if (diff < 0) {
        j = k;
        common_j = common;
      } else {
        i = k;
        common_i = common;
      }
      if (j - i <= 1) {
        if (i > 0) break;
        if (j == i) break;
        if (first_key_inspected) break;
        first_key_inspected = true;
      }
    }
    while (true) {
      Among w = v[i];
      if (common_i >= w.s_size) {
        cursor = c - w.s_size;
        if (w.method == null) return w.result;

        boolean res;
        try {
          res = (boolean) w.method.invokeExact(this);
        } catch (RuntimeException | Error e) {
          throw e;
        } catch (Throwable e) {
          throw new RuntimeException(e);
        }
        cursor = c - w.s_size;
        if (res) return w.result;
      }
      i = w.substring_i;
      if (i < 0) return 0;
    }
  }

  /* to replace chars between c_bra and c_ket in current by the
   * chars in s.
   */
  protected int replace_s(int c_bra, int c_ket, CharSequence s) {
    final int adjustment = s.length() - (c_ket - c_bra);
    final int newLength = limit + adjustment;
    // resize if necessary
    if (newLength > current.length) {
      current = Arrays.copyOf(current, newLength);
    }
    // if the substring being replaced is longer or shorter than the
    // replacement, need to shift things around
    if (adjustment != 0 && c_ket < limit) {
      System.arraycopy(current, c_ket, current, c_bra + s.length(), limit - c_ket);
    }
    // insert the replacement text
    // Note, faster is s.getChars(0, s.length(), current, c_bra);
    // but would have to duplicate this method for both String and StringBuilder
    for (int i = 0; i < s.length(); i++) current[c_bra + i] = s.charAt(i);

    limit += adjustment;
    if (cursor >= c_ket) cursor += adjustment;
    else if (cursor > c_bra) cursor = c_bra;
    return adjustment;
  }

  protected void slice_check() {
    if (bra < 0 || bra > ket || ket > limit) {
      throw new IllegalArgumentException(
          "faulty slice operation: bra=" + bra + ",ket=" + ket + ",limit=" + limit);
    }
  }

  protected void slice_from(CharSequence s) {
    slice_check();
    replace_s(bra, ket, s);
  }

  protected void slice_del() {
    slice_from((CharSequence) "");
  }

  protected void insert(int c_bra, int c_ket, CharSequence s) {
    int adjustment = replace_s(c_bra, c_ket, s);
    if (c_bra <= bra) bra += adjustment;
    if (c_bra <= ket) ket += adjustment;
  }

  /* Copy the slice into the supplied StringBuffer */
  protected StringBuilder slice_to(StringBuilder s) {
    slice_check();
    int len = ket - bra;
    s.setLength(0);
    s.append(current, bra, len);
    return s;
  }

  protected StringBuilder assign_to(StringBuilder s) {
    s.setLength(0);
    s.append(current, 0, limit);
    return s;
  }
}
