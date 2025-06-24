package slidingWindow;

/**
 * Kadane's Algorithm: O(n)
 *  Step 1: Initialize maxSum=0 and currentSum=0
 *  Step 2: Traverse and check if currentSum is greater than zero
 *      If yes, no change;
 *      If no, update currentSum=0;
 *  Step 3: Add each value of Array to currentSum
 *  Step 4: Check Maximum of currentSum and maxSum
 *
 *  Iteration Visualization:
 * | Index | num | currentSum before | currentSum after | maxSum |
 * |-------|-----|--------------------|------------------|--------|
 * |   0   |  4  |         0          |    0 + 4 = 4      |   4    |
 * |   1   | -1  |         4          |    4 - 1 = 3      |   4    |
 * |   2   |  2  |         3          |    3 + 2 = 5      |   5    |
 * |   3   | -7  |         5          |    5 - 7 = -2     |   5    |
 * |   4   |  3  |        -2          |    0 + 3 = 3      |   5    |
 * |   5   |  4  |         3          |    3 + 4 = 7      |   7    |
 *
 */
public class KadaneAlgo {

    public static int kadanes(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum = Math.max(currentSum , 0);
            currentSum +=num;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{4,-1,2,-7,3,4};

        System.out.println(kadanes(nums));
    }
}
