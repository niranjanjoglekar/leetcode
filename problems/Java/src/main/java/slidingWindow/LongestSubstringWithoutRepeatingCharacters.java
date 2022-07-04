package slidingWindow;

import java.util.HashSet;

/**
 * @author niranjanjoglekar on 04/07/22
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters object = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(object.lengthOfLongestSubstring(""));
        System.out.println(object.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(object.lengthOfLongestSubstring("bbbbb"));
        System.out.println(object.lengthOfLongestSubstring("pwwkew"));
        System.out.println(object.lengthOfLongestSubstring("AABCDEF"));
        System.out.println(object.lengthOfLongestSubstring("I AM INDIA"));
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }

        int i=0,j=0;
        int longest=0;
        int n=s.length();
        HashSet<Character> window = new HashSet<>();
        while (j<n){

            if(!window.contains(s.charAt(j))){
                window.add(s.charAt(j));
                j++;
            }else{
                window.remove(s.charAt(i));
                i++;
            }
            longest = Math.max(longest,j-i);
        }
        return longest;
    }
}
