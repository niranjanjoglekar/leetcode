/**
 * @author niranjanjoglekar on 12/06/22
 *     <p>Given a sorted array of distinct integers and a target value, return the index if the
 *     target is found. If not, return the index where it would be if it were inserted in order.
 *     <p>Input: nums = [1,3,5,6], target = 5 Output: 2
 *     <p>Input: nums = [1,3,5,6], target = 2 Output: 1
 *     <p>Input: nums = [1,3,5,6], target = 7 Output: 4
 */
public class SearchInsertPosition {

  public static void main(String[] args) {
    int nums[] = {1, 3, 5, 6};
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
    System.out.print(searchInsertPosition.searchInsert(nums, 5));
  }

  public int searchInsert(int[] nums, int target) {
    int i = 0;
    while (i < nums.length) {
      if (target <= nums[i]) {
        break;
      }
      i++;
    }
    return i;
  }
}
