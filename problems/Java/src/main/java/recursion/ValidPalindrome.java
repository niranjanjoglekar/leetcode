package recursion;

/**
 * @author niranjanjoglekar on 29/09/22
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("Radar"));
    }

    public boolean palindromeHelper(int i, int j, String s){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return palindromeHelper(i+1,j-1,s);
    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ","");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9\\s+]", "");
        return palindromeHelper(0,s.length()-1,s);
    }
}
