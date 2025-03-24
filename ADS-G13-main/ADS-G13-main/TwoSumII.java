
public class TwoSumII {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] + nums[right] == target) {
                return new int[] { left + 1, right + 1 };
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }
}
