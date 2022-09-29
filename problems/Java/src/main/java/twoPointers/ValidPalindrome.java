package twoPointers;

/**
 * @author niranjanjoglekar on 01/07/22
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome object = new ValidPalindrome();
        System.out.print(object.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9\\s+]", "");
        if (s.length() <= 1) {
            return true;
        }
        int i = 0, j = s.length() - 1;

        while (i < j && j > i) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (a != b) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}