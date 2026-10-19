package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class makingmatrix0 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        setZeroes(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> zerocol = new HashSet<>();
        Set<Integer> zerorow = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zerocol.add(i);
                    zerocol.add(j);
                }

            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zerocol.contains(i) || zerorow.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}