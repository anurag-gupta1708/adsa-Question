import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallest {

    public static int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();

        // Flatten the matrix into a list
        for (int[] row : matrix) {
            for (int num : row) {
                list.add(num);
            }
        }

        // Sort the list
        Collections.sort(list);

        // Return the k-th smallest element (1-based index)
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;

        int result = kthSmallest(matrix, k);
        System.out.println("The " + k + "-th smallest element is: " + result);
    }
}
