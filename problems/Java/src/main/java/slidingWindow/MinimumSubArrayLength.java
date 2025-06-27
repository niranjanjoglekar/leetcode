package slidingWindow;

/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target.
 * If there is no such subarray, return 0 instead.
 *
 * Example 1:
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 *
 * Example 2:
 *
 * Input: target = 10, nums = [2,1,5,1,5,3]
 * Output: 3
 * Explanation: The subarray [5,1,5] has the minimal length under the problem constraint.
 *
 * Example 2:
 *
 * Input: target = 9, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */
public class MinimumSubArrayLength {

    public int minSubArrayLen(int target, int[] nums) {
        int l=0,sum=0;
        int minimumLength=Integer.MAX_VALUE;

        for(int r=0; r<nums.length; r++){
            sum += nums[r];
            while (sum>=target){
                minimumLength = Math.min(minimumLength, r-l+1);
                sum -= nums[l];
                l++;
            }

        }
        return minimumLength == Integer.MAX_VALUE ? 0 : minimumLength;
    }
    public static void main(String[] args) {
        MinimumSubArrayLength object =new MinimumSubArrayLength();
        System.out.println(object.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        System.out.println(object.minSubArrayLen(10,new int[]{2,1,5,1,5,3}));
        System.out.println(object.minSubArrayLen(9,new int[]{1,1,1,1,1,1,1,1}));
    }
}
