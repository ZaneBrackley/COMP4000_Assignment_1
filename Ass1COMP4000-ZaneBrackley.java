/**
 * NOTE: <i>This code is an example and won't compile:</i>
 * <ul>
 * <li>The question marks further down are markers for iLearn questions 4, 5, and 6.</li>
 * <li>
 *  The code uses simultaneous assignments ("i, n = i+n, n+1", and so on).
 * </li>
 * </ul>
 */

/**
 * A 2x2 matrix of integers.
 *
 * Uses 'long' instead of 'int', so that we can safely multiply two six-digit numbers together for
 * question 12 on iLearn.
 */
class Mat {
  public final long B00, B01, B10, B11;

  public Mat(long B00, long B01, long B10, long B11) {
    this.B00 = B00;
    this.B01 = B01;
    this.B10 = B10;
    this.B11 = B11;
  }

  Mat fastMatrixExponentiation(long E) {
    long b00 = B00, b01 = B01, b10 = B10, b11 = B11;
    long p00 = 1, p01 = 0, p10 = 0, p11 = 1;
    long e = E;

    while (e != 0) {
      if (e % 2 == 0) {
        long newB00 = b00 * b00 + b01 * b10;
        long newB01 = b00 * b01 + b01 * b11;
        long newB10 = b10 * b00 + b11 * b10;
        long newB11 = b10 * b01 + b11 * b11;
        b00 = newB00;
        b01 = newB01;
        b10 = newB10;
        b11 = newB11;
        e /= 2;
      } else {
        long newP00 = p00 * b00 + p01 * b10;
        long newP01 = p00 * b01 + p01 * b11;
        long newP10 = p10 * b00 + p11 * b10;
        long newP11 = p10 * b01 + p11 * b11;
        p00 = newP00;
        p01 = newP01;
        p10 = newP10;
        p11 = newP11;
        e -= 1;
      }
    }

    return new Mat(p00, p01, p10, p11);
  }

  long fastSuperFibonacci(long N) {
    if (N == 0) return 0;
    if (N == 1) return 1;
    Mat fibMatrix = new Mat(1, 1, 1, 0);
    Mat result = fibMatrix.fastMatrixExponentiation(N - 1);
    return result.B00; 
  }
}
