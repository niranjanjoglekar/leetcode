/**
 * @author niranjanjoglekar on 03/06/22
 *
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * Return k after placing the final result in the first k slots of nums.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.print(removeDuplicates.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums.length==1) {
            return nums.length;
        }
        int slow = 0;
        int fast = 1;

        while(fast<nums.length){
            if(nums[fast] != nums[slow]){
                slow +=1;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}