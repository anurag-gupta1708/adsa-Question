public class twosumsorted {
    public static int[] findTwoSum(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
    
            while (left < right) {
                int sum = arr[left] + arr[right];
    
                if (sum == target) {
                    return new int[] { left, right };  
                } else if (sum < target) {
                    left++;  
                } else {
                    right--;  
                }
            }
    
            return new int[] { -1, -1 };  
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 7, 11, 15};
            int target = 15;
    
            int[] result = findTwoSum(arr, target);
            if (result[0] != -1) {
                System.out.println("Two numbers indices: " + result[0] + " and " + result[1]);
                System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
            } else {
                System.out.println("No two numbers Sum.");
            }
        }
    }
    

