package numbersstation;
import processing.core.*;
import java.util.Random;

public class NumbersStation {
  PApplet parent;

  public static void main(String[] args)
  {
      System.out.println("Hello world");
  }

  public NumbersStation(PApplet parent) {
    this.parent = parent;
    parent.registerMethod("dispose", this);
  }

  /**
   * @param m int size of thing to be divided
   * @param n int number of subdivisions
   * @return An array of n integers whose sum is m
   */

  public int[] randomSubdivision(int m, int n) {
    int[] vals = new int[n];

    // fill with random numbers
    int isum = 0;
    for (int i=0; i<n; i++) {
      vals[i] = (int) parent.random(m);
      isum += vals[i];
    }

    // divide each value by sum of the array, normalising.
    for (int i=0; i<n; i++) {
      vals[i] = (int) ( m * vals[i] / isum );
    }

    // There may be an error from the int() rounding.
    // distribute (or subtract) the difference randomly over the array
    int sum=0;
    for (int i=0; i<n; i++) {
      sum += vals[i];
    }

    int err = m - sum;
    for (int i=0; i<Math.abs(err); i++) {
      int idx = (int) parent.random(n);
      if (err > 0) {
        vals[idx]++;
      } else {
        vals[idx]--;
    }

    return vals;
  }

 /* ******* */
 /*  TESTS  */
 /* ******* */

  /**
   * @return 42, a universal constant.
   */

  public int testMe() {
    return 42;
  }

  /**
   * @param n int size of integer array
   * @return An array of n integers.
   */

  public int[] testArray(int n) {
    int[] arr = new int[n];
    for (int i=1; i<=n; i++) {
      arr[i-1] = i*10;
    }

    return arr;
  }

 /* *********** */
 /*  END TESTS  */
 /* *********** */

  public void dispose() {
    // Anything in here will be called automatically when 
    // the parent sketch shuts down. For instance, this might
    // shut down a thread used by this library.
  }
}
