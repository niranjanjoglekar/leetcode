/**
 * @author niranjanjoglekar on 28/06/22
 *
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 *
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 */
public class CountingBits {

    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int[] result = countingBits.countBits(5);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        int p = 1; //p tracks the index for number x
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            if (i == pow) {
                result[i] = 1;
                pow <<= 1;
                p = 1;
            } else {
                result[i] = result[p] + 1;
                p++;
            }
        }

        return result;
    }
}