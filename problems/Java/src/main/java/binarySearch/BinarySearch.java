package binarySearch;

/**
 * @author niranjanjoglekar on 03/07/22 Given an array of integers nums which is sorted in ascending
 *     order, and an integer target, write a function to search target in nums. If target exists,
 *     then return its index. Otherwise, return -1. You must write an algorithm with O(log n)
 *     runtime complexity.
 */
public class BinarySearch {

  public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
    System.out.println(binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    System.out.println(binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 2));

    int[] nums = {-1, 0, 3, 5, 9, 12};
    System.out.println(binarySearch.binarySearch(nums, 9, 0, nums.length - 1));
  }

  public int search(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

  public int binarySearch(int[] nums, int target, int low, int high) {
    if (high >= low) {
      int mid = low + (high - low) / 2;

      // If found at mid, then return it
      if (nums[mid] == target) return mid;

      // Search the left half
      if (nums[mid] > target) return binarySearch(nums, target, low, mid - 1);

      // Search the right half
      return binarySearch(nums, target, mid + 1, high);
    }
    return -1;
  }
}
