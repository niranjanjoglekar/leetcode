package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author niranjanjoglekar on 13/09/22
 *     <p>Given a collection of numbers, nums, that might contain duplicates, return all possible
 *     unique permutations in any order. Example 1: Input: nums = [1,1,2] Output: [[1,1,2], [1,2,1],
 *     [2,1,1]]
 */
public class PermutationsII {

  public static void main(String[] args) {
    PermutationsII object = new PermutationsII();
    int[] nums = {1, 1, 2};
    List<List<Integer>> lists = object.permuteUnique(nums);
    for (List<Integer> list : lists) {
      System.out.println(list + " ");
    }
  }

  List<List<Integer>> helper(int pos, int[] nums, List<List<Integer>> ans) {
    if (pos >= nums.length) {
      List<Integer> list = convertToList(nums);
      ans.add(list);
      return ans;
    }

    HashSet<Integer> set = new HashSet<>();
    for (int i = pos; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        continue;
      }
      set.add(nums[i]);
      swap(i, pos, nums);
      helper(pos + 1, nums, ans);
      swap(i, pos, nums);
    }
    return ans;
  }

  void swap(int i, int j, int[] nums) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  List<Integer> convertToList(int[] nums) {
    List<Integer> list = new ArrayList<>();
    for (int num : nums) {
      list.add(num);
    }
    return list;
  }

  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    return helper(0, nums, ans);
  }
}
