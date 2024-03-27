package recursion;

/**
 * @author niranjanjoglekar on 29/09/22 Implement pow(x, n), which calculates x raised to the power
 *     n (i.e., xn).
 *     <p>Example 1: Input: x = 2.00000, n = 10 Output: 1024.00000
 *     <p>Example 2: Input: x = 2.10000, n = 3 Output: 9.26100
 */
public class Power {

  public double myPow(double x, int n) {
    if (n == 0) {
      return 1;
    }
    double partial = myPow(x, n - 1);
    return x * partial;
  }

  public static void main(String[] args) {
    Power power = new Power();
    System.out.println(power.myPow(2, 3));
  }
}
