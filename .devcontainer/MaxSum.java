public class MaxSum {
        public static int maxSum(int[] arr, int k) {
            int n = arr.length;
    
            if (n < k) {
                System.out.println("Invalid input: K is larger than array size.");
                return -1;
            }
    
            int windowSum = 0;
            for (int i = 0; i < k; i++) {
                windowSum += arr[i];
            }
    
            int maxSum = windowSum;
    
            for (int i = k; i < n; i++) {
                windowSum += arr[i] - arr[i - k];  // Slide window forward by removing one and adding one
                maxSum = Math.max(maxSum, windowSum);
            }
    
            return maxSum;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;
    
            int result = maxSum(arr, k);
            System.out.println("Maximum sum of a subarray of size " + k + " is: " + result);
        }
    }
    

