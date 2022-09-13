package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjanjoglekar on 13/09/22
 *
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Permutations {

    public static void main(String[] args) {
        Permutations object = new Permutations();
        int[] nums = {1,2,3};
        List<List<Integer>> permutations = object.permute(nums);
        for(List<Integer> list : permutations){
            System.out.println(list + " ");
        }
    }

    void helper(int pos,int[] nums, List<List<Integer>> ans){

        if(pos>nums.length){
            List<Integer> elements = convertArrayToList(nums);
            ans.add(elements);
        }

        for(int i=pos;i<nums.length;i++){
            swap(i,pos,nums);
            helper(pos+1,nums,ans);
            swap(i,pos,nums);
        }
    }

    void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    List<Integer> convertArrayToList(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        return list;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0 , nums , ans) ;
        return ans ;
    }
}