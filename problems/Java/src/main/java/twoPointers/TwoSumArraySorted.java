package twoPointers;

/**
 * @author niranjanjoglekar on 01/07/22
 */
public class TwoSumArraySorted {

    public static void main(String[] args) {
        TwoSumArraySorted object = new TwoSumArraySorted();
        int[] numbers = new int[]{ 2, 7, 11, 15 };
        System.out.print(object.twoSum(numbers, 9));
    }

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length <= 1) {
            return null;
        }
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int x = numbers[i] + numbers[j];
            if (x < target) {
                ++i;
            } else if (x > target) {
                --j;
            } else {
                return new int[]{ i + 1, j + 1};
            }
        }
        return null;
    }
}
