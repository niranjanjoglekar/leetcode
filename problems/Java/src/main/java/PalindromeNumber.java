/**
 * @author niranjanjoglekar on 14/06/22
 *     <p>Given an integer x, return true if x is palindrome integer.
 *     <p>Input: x = 121 Output: true
 *     <p>Input: x = -121 Output: false
 *     <p>Input: x = 10 Output: false
 */
public class PalindromeNumber {

  public static void main(String[] args) {
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    System.out.print(palindromeNumber.isPalindrome(133));
  }

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    String number = String.valueOf(x);
    int i = 0, j = number.length() - 1;
    while (i < j) {
      if (number.charAt(i) != number.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
