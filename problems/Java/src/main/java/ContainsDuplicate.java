import java.util.HashMap;

/**
 * @author niranjanjoglekar on 17/06/22
 *     <p>Given an integer array nums, return true if any value appears at least twice in the array,
 *     and return false if every element is distinct.
 *     <p>Input: nums = [1,2,3,1] Output: true
 *     <p>Input: nums = [1,2,3,4] Output: false
 */
public class ContainsDuplicate {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    System.out.print(containsDuplicate.containsDuplicate(nums));
  }

  public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    if (nums.length <= 1) {
      return true;
    }

    for (int num : nums) {
      if (map.containsKey(num)) {
        return true;
      } else {
        map.put(num, 1);
      }
    }
    return false;
  }
}
