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
public class Mat {
  // The four values of matrix, later referred to as "B".
  public final long
    B00, B01, // top-left and top-right
    B10, B11; // bottom-left and bottom-right

  public Mat(long B00, long B01, long B10, long B11) {
    this.B00 = B00;
    this.B01 = B01;
    this.B10 = B10;
    this.B11 = B11;
  }

  /**
   * PRE: R >= 0
   * POST: return a matrix equal to B**E, where B is this matrix
   * Complete this for Task 2, by filling in the question marks.
   */
  Mat fastMatrixExponentiation(long E) {

    /**
     * Transcribe this code template to Java, and be sure to answer the associated questions in
     * iLearn.
     * For answering questions 4, 5, and 6, pretend that simultaneous assignments work as per usual.
     * E.g. "x,y = y,x" is valid Java for swapping two variables, and so on.
     */

    long b00,b01,b10,b11; // these come from this Matrix B
    long p00,p01,p10,p11; // To be initialised
    long e;// To be initialised
    // Only B’s should appear on the right here.
    b00,b01,b10,b11= ?,?,?,?; // Answers here correspond to iLearn question 4
    // Only constants should appear on the right here. Answer corresponding question on iLearn Quiz
    p00,p01,p10,p11= ?,?,?,?; <-- remember Java does not have concurrent assignment
    e= E;
    while (e!=0) {
      if (e%2==0) { // THEN
        // Only b’s should appear on the right here.
        b00,b01,b10,b11= ?,?,?,?; // Corresponds to iLearn question 5
        e= e/2;
      } else {
        // Both p’s and b’s will appear here.
        p00,p01,p10,p11= ?,?,?,?; // Corresponds to iLearn question 6
        e= e-1;
      }
    }
    // Use the final values in the variables p00,p01,p10,p11 to create the output matrix

    return null;
  }

  // Pre: N >= 0, B is this 2x2 matrix;
  // Post: Output the N'th Super Fibonacci number
  //        determined by your recurrence SF(N+1)= a*SF(N) + b*SF(N-1)
  // Complete this for Task 3, by identifying and removing all auxiliary variables.
  // Remember also to answer the corresponding questions 10 & 11 in the iLearn Quiz.
  long fastSuperFibonacci(long N) {
    return -1;
  }

}
