package other;

import java.util.ArrayList;
import java.util.List;

public class TransposeMatrix {
    private static int[][] transpose(int[][] matrix) {
        int[][] transMatrix = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                transMatrix[i][j] = matrix[j][i];
            }
        }

        return transMatrix;
    }

    public static void main(String[] args) {
        System.out.println(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
