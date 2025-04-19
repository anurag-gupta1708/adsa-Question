public class PrefixSum {

    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public static int rangeSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        } else {
            return prefixSum[R] - prefixSum[L - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 3, 6};

        int[] prefixSum = buildPrefixSum(arr);

        int L = 2;
        int R = 5;

        int result = rangeSum(prefixSum, L, R);
        System.out.println("Sum of elements from index " + L + " to " + R + ": " + result);
    }
}
