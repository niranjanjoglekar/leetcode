package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjanjoglekar on 30/09/22 Given an integer array nums that may contain duplicates,
 *     return all possible subsets (the power set). The solution set must not contain duplicate
 *     subsets. Return the solution in any order. Example 1: Input: nums = [1,2,2] Output:
 *     [[],[1],[1,2],[1,2,2],[2],[2,2]]
 */
public class SubSetsII {
  public static void main(String[] args) {
    SubSetsII subSetsII = new SubSetsII();
    List<List<Integer>> ans = subSetsII.subsetsWithDup(new int[] {1, 2, 2});
    for (List<Integer> list : ans) {
      System.out.println(list);
    }
  }

  void helper(int i, int[] nums, List<Integer> subSet, List<List<Integer>> ans) {
    if (i == nums.length) {
      ans.add(new ArrayList(subSet));
      return;
    }

    subSet.add(nums[i]);
    helper(i + 1, nums, subSet, ans);
    while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
      i++;
    }
    subSet.remove(subSet.size() - 1);
    helper(i + 1, nums, subSet, ans);
  }

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<Integer> subSet = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    helper(0, nums, subSet, ans);
    return ans;
  }
}
