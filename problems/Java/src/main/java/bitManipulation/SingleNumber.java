package bitManipulation;

import java.util.HashSet;
import java.util.Set;

/**
 * @author niranjanjoglekar on 05/07/22
 *     <p>Given a non-empty array of integers nums, every element appears twice except for one. Find
 *     that single one. You must implement a solution with a linear runtime complexity and use only
 *     constant extra space.
 */
public class SingleNumber {

  public static void main(String[] args) {
    SingleNumber object = new SingleNumber();
    System.out.println(object.singleNumber(new int[] {4, 1, 2, 1, 2}));
    System.out.println(object.singleNumberXOR(new int[] {4, 1, 2, 1, 2}));
  }

  public int singleNumberXOR(int[] nums) {
    int x1 = nums[0];
    for (int n : nums) {
      x1 = x1 ^ n;
    }
    return x1;
  }

  public int singleNumber(int[] nums) {

    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
      if (set.contains(n)) {
        set.remove(n);
      } else {
        set.add(n);
      }
    }
    return set.iterator().next();
  }
}
