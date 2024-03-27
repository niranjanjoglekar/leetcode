import java.util.HashMap;

/**
 * @author niranjanjoglekar on 03/06/22
 *     <p>Given an array of integers nums and an integer target, return indices of the two numbers
 *     such that they add up to target.
 *     <p>You may assume that each input would have exactly one solution.
 *     <p>Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] + nums[1]
 *     == 9, we return [0, 1].
 */
public class TwoSum {

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    int[] nums = {2, 7, 11, 15};
    int[] result = twoSum.twoSum(nums, 9);
    for (int num : result) {
      System.out.print(num + " ");
    }
  }

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum[] = new int[2];
    map.put(nums[0], 0);
    for (int i = 1; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        sum[1] = map.get(target - nums[i]);
        sum[0] = i;
      } else {
        map.put(nums[i], i);
      }
    }
    return sum;
  }
}
