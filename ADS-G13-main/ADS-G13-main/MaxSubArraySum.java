import java.util.*;

public class MaxSubArraySum {

    public static int maxSubarraySum(int[] arr) {
        int r = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int curr = 0;

            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];

                r = Math.max(r, curr);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(maxSubarraySum(arr));
    }
}
