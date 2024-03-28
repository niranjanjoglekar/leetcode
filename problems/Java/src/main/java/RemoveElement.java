/**
 * @author niranjanjoglekar on 12/06/22 Given an integer array nums and an integer val, remove all
 *     occurrences of val in nums in-place. The relative order of the elements may be changed.
 *     <p>Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_]
 *     <p>Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_]
 */
public class RemoveElement {

  public static void main(String[] args) {
    int[] nums = {3, 2, 2, 3};
    RemoveElement removeElement = new RemoveElement();
    System.out.print(removeElement.removeElement(nums, 3));
  }

  public int removeElement(int[] nums, int val) {

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[count++] = nums[i];
      }
    }
    return count;
  }
}
