public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int max_prod = nums[0]; 
        int min_prod = nums[0]; 
        int result = max_prod;  

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max_prod;
                max_prod = min_prod;
                min_prod = temp;
            }

            max_prod = Math.max(nums[i], max_prod * nums[i]);
            min_prod = Math.min(nums[i], min_prod * nums[i]);

            result = Math.max(result, max_prod);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int result = maxProduct(nums);
        System.out.println("Maximum product of subarray: " + result);
    }
}
