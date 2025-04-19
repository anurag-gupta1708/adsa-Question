public class EqualPrefixSuffic {
    

        public static boolean canBeSplit(int[] arr) {
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }
    
            int prefixSum = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                prefixSum += arr[i];
                int suffixSum = totalSum - prefixSum;
    
                if (prefixSum == suffixSum) {
                    System.out.println("Array can be split after index " + i);
                    return true;
                }
            }
    
            return false;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 6};
    
            if (!canBeSplit(arr)) {
                System.out.println("Array cannot be split into equal prefix and suffix sums.");
            }
        }
    }
    

