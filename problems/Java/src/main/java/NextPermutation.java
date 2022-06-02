/**
 * @author niranjanjoglekar on 01/06/22
 *
 * Implement next permutation of an array of integers is the next lexicographically greater permutation of its integer.
 * If such arrangement is not possible, the array must be rearranged as the lowest possible order.
 *
 */
public class NextPermutation {

    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        int nums[] = {5,4,7,5,3,2};
        nextPermutation.nextPermutation(nums);
    }

    public void nextPermutation(int[] nums) {

        if(nums.length<=1) {
            return;
        }
        // Index of the first element that is smaller than
        // the element to its right.
        int index = -1;
        // Loop from right to left
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        // This means numbers are in decreasing order. Reverse full array
        // e.g  4 3 2 1
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = nums.length - 1;
        // Again swap from right to left to find first element
        // that is greater than the above find element
        for (int i = nums.length - 1; i >= index + 1; i--) {
            if (nums[i] > nums[index]) {
                j = i;
                break;
            }
        }
        // Swap the elements
        swap(nums, index, j);
        // Reverse the elements from index + 1 to the nums.length -1
        reverse(nums, index + 1, nums.length - 1);
    }
    public void swap(int[] nums,int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public void reverse(int[] nums,int i, int j){
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}