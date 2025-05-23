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

/**
 * This class was automatically generated by a Snowball to Java compiler It implements the stemming
 * algorithm defined by a snowball script.
 */
@SuppressWarnings("unused")
public class HungarianStemmer extends SnowballProgram {

  private static final long serialVersionUID = 1L;

  /* patched */ private static final java.lang.invoke.MethodHandles.Lookup methodObject =
      java.lang.invoke.MethodHandles.lookup();

  private static final Among a_0[] = {
    new Among("cs", -1, -1, "", methodObject),
    new Among("dzs", -1, -1, "", methodObject),
    new Among("gy", -1, -1, "", methodObject),
    new Among("ly", -1, -1, "", methodObject),
    new Among("ny", -1, -1, "", methodObject),
    new Among("sz", -1, -1, "", methodObject),
    new Among("ty", -1, -1, "", methodObject),
    new Among("zs", -1, -1, "", methodObject)
  };

  private static final Among a_1[] = {
    new Among("\u00E1", -1, 1, "", methodObject), new Among("\u00E9", -1, 2, "", methodObject)
  };

  private static final Among a_2[] = {
    new Among("bb", -1, -1, "", methodObject),
    new Among("cc", -1, -1, "", methodObject),
    new Among("dd", -1, -1, "", methodObject),
    new Among("ff", -1, -1, "", methodObject),
    new Among("gg", -1, -1, "", methodObject),
    new Among("jj", -1, -1, "", methodObject),
    new Among("kk", -1, -1, "", methodObject),
    new Among("ll", -1, -1, "", methodObject),
    new Among("mm", -1, -1, "", methodObject),
    new Among("nn", -1, -1, "", methodObject),
    new Among("pp", -1, -1, "", methodObject),
    new Among("rr", -1, -1, "", methodObject),
    new Among("ccs", -1, -1, "", methodObject),
    new Among("ss", -1, -1, "", methodObject),
    new Among("zzs", -1, -1, "", methodObject),
    new Among("tt", -1, -1, "", methodObject),
    new Among("vv", -1, -1, "", methodObject),
    new Among("ggy", -1, -1, "", methodObject),
    new Among("lly", -1, -1, "", methodObject),
    new Among("nny", -1, -1, "", methodObject),
    new Among("tty", -1, -1, "", methodObject),
    new Among("ssz", -1, -1, "", methodObject),
    new Among("zz", -1, -1, "", methodObject)
  };

  private static final Among a_3[] = {
    new Among("al", -1, 1, "", methodObject), new Among("el", -1, 2, "", methodObject)
  };

  private static final Among a_4[] = {
    new Among("ba", -1, -1, "", methodObject),
    new Among("ra", -1, -1, "", methodObject),
    new Among("be", -1, -1, "", methodObject),
    new Among("re", -1, -1, "", methodObject),
    new Among("ig", -1, -1, "", methodObject),
    new Among("nak", -1, -1, "", methodObject),
    new Among("nek", -1, -1, "", methodObject),
    new Among("val", -1, -1, "", methodObject),
    new Among("vel", -1, -1, "", methodObject),
    new Among("ul", -1, -1, "", methodObject),
    new Among("n\u00E1l", -1, -1, "", methodObject),
    new Among("n\u00E9l", -1, -1, "", methodObject),
    new Among("b\u00F3l", -1, -1, "", methodObject),
    new Among("r\u00F3l", -1, -1, "", methodObject),
    new Among("t\u00F3l", -1, -1, "", methodObject),
    new Among("b\u00F5l", -1, -1, "", methodObject),
    new Among("r\u00F5l", -1, -1, "", methodObject),
    new Among("t\u00F5l", -1, -1, "", methodObject),
    new Among("\u00FCl", -1, -1, "", methodObject),
    new Among("n", -1, -1, "", methodObject),
    new Among("an", 19, -1, "", methodObject),
    new Among("ban", 20, -1, "", methodObject),
    new Among("en", 19, -1, "", methodObject),
    new Among("ben", 22, -1, "", methodObject),
    new Among("k\u00E9ppen", 22, -1, "", methodObject),
    new Among("on", 19, -1, "", methodObject),
    new Among("\u00F6n", 19, -1, "", methodObject),
    new Among("k\u00E9pp", -1, -1, "", methodObject),
    new Among("kor", -1, -1, "", methodObject),
    new Among("t", -1, -1, "", methodObject),
    new Among("at", 29, -1, "", methodObject),
    new Among("et", 29, -1, "", methodObject),
    new Among("k\u00E9nt", 29, -1, "", methodObject),
    new Among("ank\u00E9nt", 32, -1, "", methodObject),
    new Among("enk\u00E9nt", 32, -1, "", methodObject),
    new Among("onk\u00E9nt", 32, -1, "", methodObject),
    new Among("ot", 29, -1, "", methodObject),
    new Among("\u00E9rt", 29, -1, "", methodObject),
    new Among("\u00F6t", 29, -1, "", methodObject),
    new Among("hez", -1, -1, "", methodObject),
    new Among("hoz", -1, -1, "", methodObject),
    new Among("h\u00F6z", -1, -1, "", methodObject),
    new Among("v\u00E1", -1, -1, "", methodObject),
    new Among("v\u00E9", -1, -1, "", methodObject)
  };

  private static final Among a_5[] = {
    new Among("\u00E1n", -1, 2, "", methodObject),
    new Among("\u00E9n", -1, 1, "", methodObject),
    new Among("\u00E1nk\u00E9nt", -1, 3, "", methodObject)
  };

  private static final Among a_6[] = {
    new Among("stul", -1, 2, "", methodObject),
    new Among("astul", 0, 1, "", methodObject),
    new Among("\u00E1stul", 0, 3, "", methodObject),
    new Among("st\u00FCl", -1, 2, "", methodObject),
    new Among("est\u00FCl", 3, 1, "", methodObject),
    new Among("\u00E9st\u00FCl", 3, 4, "", methodObject)
  };

  private static final Among a_7[] = {
    new Among("\u00E1", -1, 1, "", methodObject), new Among("\u00E9", -1, 2, "", methodObject)
  };

  private static final Among a_8[] = {
    new Among("k", -1, 7, "", methodObject),
    new Among("ak", 0, 4, "", methodObject),
    new Among("ek", 0, 6, "", methodObject),
    new Among("ok", 0, 5, "", methodObject),
    new Among("\u00E1k", 0, 1, "", methodObject),
    new Among("\u00E9k", 0, 2, "", methodObject),
    new Among("\u00F6k", 0, 3, "", methodObject)
  };

  private static final Among a_9[] = {
    new Among("\u00E9i", -1, 7, "", methodObject),
    new Among("\u00E1\u00E9i", 0, 6, "", methodObject),
    new Among("\u00E9\u00E9i", 0, 5, "", methodObject),
    new Among("\u00E9", -1, 9, "", methodObject),
    new Among("k\u00E9", 3, 4, "", methodObject),
    new Among("ak\u00E9", 4, 1, "", methodObject),
    new Among("ek\u00E9", 4, 1, "", methodObject),
    new Among("ok\u00E9", 4, 1, "", methodObject),
    new Among("\u00E1k\u00E9", 4, 3, "", methodObject),
    new Among("\u00E9k\u00E9", 4, 2, "", methodObject),
    new Among("\u00F6k\u00E9", 4, 1, "", methodObject),
    new Among("\u00E9\u00E9", 3, 8, "", methodObject)
  };

  private static final Among a_10[] = {
    new Among("a", -1, 18, "", methodObject),
    new Among("ja", 0, 17, "", methodObject),
    new Among("d", -1, 16, "", methodObject),
    new Among("ad", 2, 13, "", methodObject),
    new Among("ed", 2, 13, "", methodObject),
    new Among("od", 2, 13, "", methodObject),
    new Among("\u00E1d", 2, 14, "", methodObject),
    new Among("\u00E9d", 2, 15, "", methodObject),
    new Among("\u00F6d", 2, 13, "", methodObject),
    new Among("e", -1, 18, "", methodObject),
    new Among("je", 9, 17, "", methodObject),
    new Among("nk", -1, 4, "", methodObject),
    new Among("unk", 11, 1, "", methodObject),
    new Among("\u00E1nk", 11, 2, "", methodObject),
    new Among("\u00E9nk", 11, 3, "", methodObject),
    new Among("\u00FCnk", 11, 1, "", methodObject),
    new Among("uk", -1, 8, "", methodObject),
    new Among("juk", 16, 7, "", methodObject),
    new Among("\u00E1juk", 17, 5, "", methodObject),
    new Among("\u00FCk", -1, 8, "", methodObject),
    new Among("j\u00FCk", 19, 7, "", methodObject),
    new Among("\u00E9j\u00FCk", 20, 6, "", methodObject),
    new Among("m", -1, 12, "", methodObject),
    new Among("am", 22, 9, "", methodObject),
    new Among("em", 22, 9, "", methodObject),
    new Among("om", 22, 9, "", methodObject),
    new Among("\u00E1m", 22, 10, "", methodObject),
    new Among("\u00E9m", 22, 11, "", methodObject),
    new Among("o", -1, 18, "", methodObject),
    new Among("\u00E1", -1, 19, "", methodObject),
    new Among("\u00E9", -1, 20, "", methodObject)
  };

  private static final Among a_11[] = {
    new Among("id", -1, 10, "", methodObject),
    new Among("aid", 0, 9, "", methodObject),
    new Among("jaid", 1, 6, "", methodObject),
    new Among("eid", 0, 9, "", methodObject),
    new Among("jeid", 3, 6, "", methodObject),
    new Among("\u00E1id", 0, 7, "", methodObject),
    new Among("\u00E9id", 0, 8, "", methodObject),
    new Among("i", -1, 15, "", methodObject),
    new Among("ai", 7, 14, "", methodObject),
    new Among("jai", 8, 11, "", methodObject),
    new Among("ei", 7, 14, "", methodObject),
    new Among("jei", 10, 11, "", methodObject),
    new Among("\u00E1i", 7, 12, "", methodObject),
    new Among("\u00E9i", 7, 13, "", methodObject),
    new Among("itek", -1, 24, "", methodObject),
    new Among("eitek", 14, 21, "", methodObject),
    new Among("jeitek", 15, 20, "", methodObject),
    new Among("\u00E9itek", 14, 23, "", methodObject),
    new Among("ik", -1, 29, "", methodObject),
    new Among("aik", 18, 26, "", methodObject),
    new Among("jaik", 19, 25, "", methodObject),
    new Among("eik", 18, 26, "", methodObject),
    new Among("jeik", 21, 25, "", methodObject),
    new Among("\u00E1ik", 18, 27, "", methodObject),
    new Among("\u00E9ik", 18, 28, "", methodObject),
    new Among("ink", -1, 20, "", methodObject),
    new Among("aink", 25, 17, "", methodObject),
    new Among("jaink", 26, 16, "", methodObject),
    new Among("eink", 25, 17, "", methodObject),
    new Among("jeink", 28, 16, "", methodObject),
    new Among("\u00E1ink", 25, 18, "", methodObject),
    new Among("\u00E9ink", 25, 19, "", methodObject),
    new Among("aitok", -1, 21, "", methodObject),
    new Among("jaitok", 32, 20, "", methodObject),
    new Among("\u00E1itok", -1, 22, "", methodObject),
    new Among("im", -1, 5, "", methodObject),
    new Among("aim", 35, 4, "", methodObject),
    new Among("jaim", 36, 1, "", methodObject),
    new Among("eim", 35, 4, "", methodObject),
    new Among("jeim", 38, 1, "", methodObject),
    new Among("\u00E1im", 35, 2, "", methodObject),
    new Among("\u00E9im", 35, 3, "", methodObject)
  };

  private static final char g_v[] = {
    17, 65, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 17, 52, 14
  };

  private int I_p1;

  private void copy_from(HungarianStemmer other) {
    I_p1 = other.I_p1;
    super.copy_from(other);
  }

  private boolean r_mark_regions() {
    int v_1;
    int v_2;
    int v_3;
    // (, line 44
    I_p1 = limit;
    // or, line 51
    lab0:
    do {
      v_1 = cursor;
      lab1:
      do {
        // (, line 48
        if (!(in_grouping(g_v, 97, 252))) {
          break lab1;
        }
        // goto, line 48
        golab2:
        while (true) {
          v_2 = cursor;
          lab3:
          do {
            if (!(out_grouping(g_v, 97, 252))) {
              break lab3;
            }
            cursor = v_2;
            break golab2;
          } while (false);
          cursor = v_2;
          if (cursor >= limit) {
            break lab1;
          }
          cursor++;
        }
        // or, line 49
        lab4:
        do {
          v_3 = cursor;
          lab5:
          do {
            // among, line 49
            if (find_among(a_0, 8) == 0) {
              break lab5;
            }
            break lab4;
          } while (false);
          cursor = v_3;
          // next, line 49
          if (cursor >= limit) {
            break lab1;
          }
          cursor++;
        } while (false);
        // setmark p1, line 50
        I_p1 = cursor;
        break lab0;
      } while (false);
      cursor = v_1;
      // (, line 53
      if (!(out_grouping(g_v, 97, 252))) {
        return false;
      }
      // gopast, line 53
      golab6:
      while (true) {
        lab7:
        do {
          if (!(in_grouping(g_v, 97, 252))) {
            break lab7;
          }
          break golab6;
        } while (false);
        if (cursor >= limit) {
          return false;
        }
        cursor++;
      }
      // setmark p1, line 53
      I_p1 = cursor;
    } while (false);
    return true;
  }

  private boolean r_R1() {
    if (!(I_p1 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_v_ending() {
    int among_var;
    // (, line 60
    // [, line 61
    ket = cursor;
    // substring, line 61
    among_var = find_among_b(a_1, 2);
    if (among_var == 0) {
      return false;
    }
    // ], line 61
    bra = cursor;
    // call R1, line 61
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 62
        // <-, line 62
        slice_from("a");
        break;
      case 2:
        // (, line 63
        // <-, line 63
        slice_from("e");
        break;
    }
    return true;
  }

  private boolean r_double() {
    int v_1;
    // (, line 67
    // test, line 68
    v_1 = limit - cursor;
    // among, line 68
    if (find_among_b(a_2, 23) == 0) {
      return false;
    }
    cursor = limit - v_1;
    return true;
  }

  private boolean r_undouble() {
    // (, line 72
    // next, line 73
    if (cursor <= limit_backward) {
      return false;
    }
    cursor--;
    // [, line 73
    ket = cursor;
    // hop, line 73
    {
      int c = cursor - 1;
      if (limit_backward > c || c > limit) {
        return false;
      }
      cursor = c;
    }
    // ], line 73
    bra = cursor;
    // delete, line 73
    slice_del();
    return true;
  }

  private boolean r_instrum() {
    int among_var;
    // (, line 76
    // [, line 77
    ket = cursor;
    // substring, line 77
    among_var = find_among_b(a_3, 2);
    if (among_var == 0) {
      return false;
    }
    // ], line 77
    bra = cursor;
    // call R1, line 77
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 78
        // call double, line 78
        if (!r_double()) {
          return false;
        }
        break;
      case 2:
        // (, line 79
        // call double, line 79
        if (!r_double()) {
          return false;
        }
        break;
    }
    // delete, line 81
    slice_del();
    // call undouble, line 82
    if (!r_undouble()) {
      return false;
    }
    return true;
  }

  private boolean r_case() {
    // (, line 86
    // [, line 87
    ket = cursor;
    // substring, line 87
    if (find_among_b(a_4, 44) == 0) {
      return false;
    }
    // ], line 87
    bra = cursor;
    // call R1, line 87
    if (!r_R1()) {
      return false;
    }
    // delete, line 111
    slice_del();
    // call v_ending, line 112
    if (!r_v_ending()) {
      return false;
    }
    return true;
  }

  private boolean r_case_special() {
    int among_var;
    // (, line 115
    // [, line 116
    ket = cursor;
    // substring, line 116
    among_var = find_among_b(a_5, 3);
    if (among_var == 0) {
      return false;
    }
    // ], line 116
    bra = cursor;
    // call R1, line 116
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 117
        // <-, line 117
        slice_from("e");
        break;
      case 2:
        // (, line 118
        // <-, line 118
        slice_from("a");
        break;
      case 3:
        // (, line 119
        // <-, line 119
        slice_from("a");
        break;
    }
    return true;
  }

  private boolean r_case_other() {
    int among_var;
    // (, line 123
    // [, line 124
    ket = cursor;
    // substring, line 124
    among_var = find_among_b(a_6, 6);
    if (among_var == 0) {
      return false;
    }
    // ], line 124
    bra = cursor;
    // call R1, line 124
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 125
        // delete, line 125
        slice_del();
        break;
      case 2:
        // (, line 126
        // delete, line 126
        slice_del();
        break;
      case 3:
        // (, line 127
        // <-, line 127
        slice_from("a");
        break;
      case 4:
        // (, line 128
        // <-, line 128
        slice_from("e");
        break;
    }
    return true;
  }

  private boolean r_factive() {
    int among_var;
    // (, line 132
    // [, line 133
    ket = cursor;
    // substring, line 133
    among_var = find_among_b(a_7, 2);
    if (among_var == 0) {
      return false;
    }
    // ], line 133
    bra = cursor;
    // call R1, line 133
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 134
        // call double, line 134
        if (!r_double()) {
          return false;
        }
        break;
      case 2:
        // (, line 135
        // call double, line 135
        if (!r_double()) {
          return false;
        }
        break;
    }
    // delete, line 137
    slice_del();
    // call undouble, line 138
    if (!r_undouble()) {
      return false;
    }
    return true;
  }

  private boolean r_plural() {
    int among_var;
    // (, line 141
    // [, line 142
    ket = cursor;
    // substring, line 142
    among_var = find_among_b(a_8, 7);
    if (among_var == 0) {
      return false;
    }
    // ], line 142
    bra = cursor;
    // call R1, line 142
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 143
        // <-, line 143
        slice_from("a");
        break;
      case 2:
        // (, line 144
        // <-, line 144
        slice_from("e");
        break;
      case 3:
        // (, line 145
        // delete, line 145
        slice_del();
        break;
      case 4:
        // (, line 146
        // delete, line 146
        slice_del();
        break;
      case 5:
        // (, line 147
        // delete, line 147
        slice_del();
        break;
      case 6:
        // (, line 148
        // delete, line 148
        slice_del();
        break;
      case 7:
        // (, line 149
        // delete, line 149
        slice_del();
        break;
    }
    return true;
  }

  private boolean r_owned() {
    int among_var;
    // (, line 153
    // [, line 154
    ket = cursor;
    // substring, line 154
    among_var = find_among_b(a_9, 12);
    if (among_var == 0) {
      return false;
    }
    // ], line 154
    bra = cursor;
    // call R1, line 154
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 155
        // delete, line 155
        slice_del();
        break;
      case 2:
        // (, line 156
        // <-, line 156
        slice_from("e");
        break;
      case 3:
        // (, line 157
        // <-, line 157
        slice_from("a");
        break;
      case 4:
        // (, line 158
        // delete, line 158
        slice_del();
        break;
      case 5:
        // (, line 159
        // <-, line 159
        slice_from("e");
        break;
      case 6:
        // (, line 160
        // <-, line 160
        slice_from("a");
        break;
      case 7:
        // (, line 161
        // delete, line 161
        slice_del();
        break;
      case 8:
        // (, line 162
        // <-, line 162
        slice_from("e");
        break;
      case 9:
        // (, line 163
        // delete, line 163
        slice_del();
        break;
    }
    return true;
  }

  private boolean r_sing_owner() {
    int among_var;
    // (, line 167
    // [, line 168
    ket = cursor;
    // substring, line 168
    among_var = find_among_b(a_10, 31);
    if (among_var == 0) {
      return false;
    }
    // ], line 168
    bra = cursor;
    // call R1, line 168
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 169
        // delete, line 169
        slice_del();
        break;
      case 2:
        // (, line 170
        // <-, line 170
        slice_from("a");
        break;
      case 3:
        // (, line 171
        // <-, line 171
        slice_from("e");
        break;
      case 4:
        // (, line 172
        // delete, line 172
        slice_del();
        break;
      case 5:
        // (, line 173
        // <-, line 173
        slice_from("a");
        break;
      case 6:
        // (, line 174
        // <-, line 174
        slice_from("e");
        break;
      case 7:
        // (, line 175
        // delete, line 175
        slice_del();
        break;
      case 8:
        // (, line 176
        // delete, line 176
        slice_del();
        break;
      case 9:
        // (, line 177
        // delete, line 177
        slice_del();
        break;
      case 10:
        // (, line 178
        // <-, line 178
        slice_from("a");
        break;
      case 11:
        // (, line 179
        // <-, line 179
        slice_from("e");
        break;
      case 12:
        // (, line 180
        // delete, line 180
        slice_del();
        break;
      case 13:
        // (, line 181
        // delete, line 181
        slice_del();
        break;
      case 14:
        // (, line 182
        // <-, line 182
        slice_from("a");
        break;
      case 15:
        // (, line 183
        // <-, line 183
        slice_from("e");
        break;
      case 16:
        // (, line 184
        // delete, line 184
        slice_del();
        break;
      case 17:
        // (, line 185
        // delete, line 185
        slice_del();
        break;
      case 18:
        // (, line 186
        // delete, line 186
        slice_del();
        break;
      case 19:
        // (, line 187
        // <-, line 187
        slice_from("a");
        break;
      case 20:
        // (, line 188
        // <-, line 188
        slice_from("e");
        break;
    }
    return true;
  }

  private boolean r_plur_owner() {
    int among_var;
    // (, line 192
    // [, line 193
    ket = cursor;
    // substring, line 193
    among_var = find_among_b(a_11, 42);
    if (among_var == 0) {
      return false;
    }
    // ], line 193
    bra = cursor;
    // call R1, line 193
    if (!r_R1()) {
      return false;
    }
    switch (among_var) {
      case 0:
        return false;
      case 1:
        // (, line 194
        // delete, line 194
        slice_del();
        break;
      case 2:
        // (, line 195
        // <-, line 195
        slice_from("a");
        break;
      case 3:
        // (, line 196
        // <-, line 196
        slice_from("e");
        break;
      case 4:
        // (, line 197
        // delete, line 197
        slice_del();
        break;
      case 5:
        // (, line 198
        // delete, line 198
        slice_del();
        break;
      case 6:
        // (, line 199
        // delete, line 199
        slice_del();
        break;
      case 7:
        // (, line 200
        // <-, line 200
        slice_from("a");
        break;
      case 8:
        // (, line 201
        // <-, line 201
        slice_from("e");
        break;
      case 9:
        // (, line 202
        // delete, line 202
        slice_del();
        break;
      case 10:
        // (, line 203
        // delete, line 203
        slice_del();
        break;
      case 11:
        // (, line 204
        // delete, line 204
        slice_del();
        break;
      case 12:
        // (, line 205
        // <-, line 205
        slice_from("a");
        break;
      case 13:
        // (, line 206
        // <-, line 206
        slice_from("e");
        break;
      case 14:
        // (, line 207
        // delete, line 207
        slice_del();
        break;
      case 15:
        // (, line 208
        // delete, line 208
        slice_del();
        break;
      case 16:
        // (, line 209
        // delete, line 209
        slice_del();
        break;
      case 17:
        // (, line 210
        // delete, line 210
        slice_del();
        break;
      case 18:
        // (, line 211
        // <-, line 211
        slice_from("a");
        break;
      case 19:
        // (, line 212
        // <-, line 212
        slice_from("e");
        break;
      case 20:
        // (, line 214
        // delete, line 214
        slice_del();
        break;
      case 21:
        // (, line 215
        // delete, line 215
        slice_del();
        break;
      case 22:
        // (, line 216
        // <-, line 216
        slice_from("a");
        break;
      case 23:
        // (, line 217
        // <-, line 217
        slice_from("e");
        break;
      case 24:
        // (, line 218
        // delete, line 218
        slice_del();
        break;
      case 25:
        // (, line 219
        // delete, line 219
        slice_del();
        break;
      case 26:
        // (, line 220
        // delete, line 220
        slice_del();
        break;
      case 27:
        // (, line 221
        // <-, line 221
        slice_from("a");
        break;
      case 28:
        // (, line 222
        // <-, line 222
        slice_from("e");
        break;
      case 29:
        // (, line 223
        // delete, line 223
        slice_del();
        break;
    }
    return true;
  }

  @Override
  public boolean stem() {
    int v_1;
    int v_2;
    int v_3;
    int v_4;
    int v_5;
    int v_6;
    int v_7;
    int v_8;
    int v_9;
    int v_10;
    // (, line 228
    // do, line 229
    v_1 = cursor;
    lab0:
    do {
      // call mark_regions, line 229
      if (!r_mark_regions()) {
        break lab0;
      }
    } while (false);
    cursor = v_1;
    // backwards, line 230
    limit_backward = cursor;
    cursor = limit;
    // (, line 230
    // do, line 231
    v_2 = limit - cursor;
    lab1:
    do {
      // call instrum, line 231
      if (!r_instrum()) {
        break lab1;
      }
    } while (false);
    cursor = limit - v_2;
    // do, line 232
    v_3 = limit - cursor;
    lab2:
    do {
      // call case, line 232
      if (!r_case()) {
        break lab2;
      }
    } while (false);
    cursor = limit - v_3;
    // do, line 233
    v_4 = limit - cursor;
    lab3:
    do {
      // call case_special, line 233
      if (!r_case_special()) {
        break lab3;
      }
    } while (false);
    cursor = limit - v_4;
    // do, line 234
    v_5 = limit - cursor;
    lab4:
    do {
      // call case_other, line 234
      if (!r_case_other()) {
        break lab4;
      }
    } while (false);
    cursor = limit - v_5;
    // do, line 235
    v_6 = limit - cursor;
    lab5:
    do {
      // call factive, line 235
      if (!r_factive()) {
        break lab5;
      }
    } while (false);
    cursor = limit - v_6;
    // do, line 236
    v_7 = limit - cursor;
    lab6:
    do {
      // call owned, line 236
      if (!r_owned()) {
        break lab6;
      }
    } while (false);
    cursor = limit - v_7;
    // do, line 237
    v_8 = limit - cursor;
    lab7:
    do {
      // call sing_owner, line 237
      if (!r_sing_owner()) {
        break lab7;
      }
    } while (false);
    cursor = limit - v_8;
    // do, line 238
    v_9 = limit - cursor;
    lab8:
    do {
      // call plur_owner, line 238
      if (!r_plur_owner()) {
        break lab8;
      }
    } while (false);
    cursor = limit - v_9;
    // do, line 239
    v_10 = limit - cursor;
    lab9:
    do {
      // call plural, line 239
      if (!r_plural()) {
        break lab9;
      }
    } while (false);
    cursor = limit - v_10;
    cursor = limit_backward;
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof HungarianStemmer;
  }

  @Override
  public int hashCode() {
    return HungarianStemmer.class.getName().hashCode();
  }
}
