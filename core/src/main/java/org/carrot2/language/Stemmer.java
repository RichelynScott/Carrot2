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
package org.carrot2.language;

/**
 * Simple lemmatization engine transforming an inflected form of a word to its base form or some
 * other unique token.
 */
public interface Stemmer {
  /**
   * Returns the base form of the provided word or <code>null</code> if the base form cannot be
   * determined. In the latter case, the base form will be assumed to be the same as the original
   * word.
   */
  CharSequence stem(CharSequence word);
}
