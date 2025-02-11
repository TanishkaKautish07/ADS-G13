import java.util.*;

public class ClosestPair {
    public static int[] sumClosest(int[] arr, int target) {
        Arrays.sort(arr);

        int maxDiff = Integer.MIN_VALUE;
        int left = 0;
        int right = arr.length - 1;
        int closest = Integer.MAX_VALUE;
        int[] result = new int[2]; 
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum;
                maxDiff = arr[right] - arr[left];
                result = new int[] {arr[left], arr[right]};
                
            } else if (Math.abs(target - sum) == Math.abs(target - closest)) {
                if (arr[right] - arr[left] > maxDiff) {
                    maxDiff = arr[right] - arr[left];
                    result = new int[] {arr[left], arr[right]};
                }
            }
            
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 7, 1, 4};
        int target = 10;

        int[] arr = sumClosest(arr1, target);
        System.out.println(arr[0] + " " + arr[1]);
    }
}
