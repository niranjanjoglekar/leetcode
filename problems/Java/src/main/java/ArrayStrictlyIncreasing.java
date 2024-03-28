/**
 * @author niranjanjoglekar on 14/06/22
 *     <p>Given a 0-indexed integer array nums, return true if it can be made strictly increasing
 *     after removing exactly one element, or false otherwise. If the array is already strictly
 *     increasing, return true.
 *     <p>Input: nums = [1,2,10,5,7] Output: true
 *     <p>Input: nums = [2,3,1,2] Output: false
 *     <p>Input: nums = [1,1,1] Output: false
 */
public class ArrayStrictlyIncreasing {

  public static void main(String[] args) {
    int[] nums = {105, 924, 32, 968};
    ArrayStrictlyIncreasing arrayStrictlyIncreasing = new ArrayStrictlyIncreasing();
    System.out.print(arrayStrictlyIncreasing.canBeIncreasing(nums));
  }

  public boolean canBeIncreasing(int[] nums) {
    boolean removed = false;

    for (int i = 1; i < nums.length; ++i)
      if (nums[i - 1] >= nums[i]) {
        if (removed) return false;
        removed = true; // remove nums[i - 1]
        if (i > 1 && nums[i - 2] >= nums[i]) nums[i] = nums[i - 1]; // remove nums[i] instead
      }
    return true;
  }
}
