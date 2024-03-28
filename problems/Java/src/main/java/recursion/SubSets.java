package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjanjoglekar on 29/09/22
 *     <p>Given an integer array nums of unique elements, return all possible subsets (the power
 *     set). The solution set must not contain duplicate subsets. Return the solution in any order.
 *     <p>Example 1: Input: nums = [1,2,3] Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */
public class SubSets {

  public static void main(String[] args) {
    SubSets subSets = new SubSets();
    List<List<Integer>> ans = subSets.subsets(new int[] {1, 2, 3});

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
    subSet.remove(subSet.size() - 1);
    helper(i + 1, nums, subSet, ans);
  }

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    helper(0, nums, new ArrayList<>(), ans);
    return ans;
  }
}
