/**
 * @author niranjanjoglekar on 06/06/22
 *     <p>Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
 *     the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *     <p>Input: x = -123 Input: x = 123 Input: x = 120 Output: -321 Output: -321 Output: 21
 */
public class ReverseInteger {

  public static void main(String[] args) {
    ReverseInteger reverseInteger = new ReverseInteger();
    System.out.println(reverseInteger.reverse(123));
    System.out.println(reverseInteger.reverse(-321));
    System.out.println(reverseInteger.reverse(120));
  }

  public int reverse(int x) {
    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
      x = -x;
    }
    long reverse = 0;
    while (x > 0) {
      reverse = reverse * 10 + x % 10;
      x /= 10;
    }
    if (reverse > Integer.MAX_VALUE) {
      return 0;
    }
    return (int) (isNegative ? -reverse : reverse);
  }
}
