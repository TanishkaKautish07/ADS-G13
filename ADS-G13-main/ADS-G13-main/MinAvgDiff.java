
public class MinAvgDiff {

    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long totalSum = 0, leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        int resultIndex = 0;
        long minAvgDiff = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            long leftAvg = leftSum / (i + 1);

            long rightAvg = (i == n - 1) ? 0 : (totalSum - leftSum) / (n - i - 1);

            long avgDiff = Math.abs(leftAvg - rightAvg);

            if (avgDiff < minAvgDiff) {
                minAvgDiff = avgDiff;
                resultIndex = i;
            }
        }

        return resultIndex;
    }

    public static void main(String[] args) {

        int[] nums1 = { 2, 5, 3, 9, 5, 3 };
        System.out.println("Minimum average difference index: " + minimumAverageDifference(nums1));
    }

}