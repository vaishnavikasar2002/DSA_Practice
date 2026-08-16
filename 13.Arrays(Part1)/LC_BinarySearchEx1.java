//self LQ-704
// Example 1:
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

public class LC_BinarySearchEx1 {

    public static int binarySearch(int nums[], int key) {

        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //comparision
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] agrs) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int key = 9;
        System.out.println("index for key is : " + binarySearch(nums, key));
    }
}
