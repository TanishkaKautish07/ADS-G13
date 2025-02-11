class SplitArrayWays {
    public static int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;
            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 4, -8, 7 };
        System.out.println("Number of Ways to Split Array: " + waysToSplitArray(nums));
    }
}
