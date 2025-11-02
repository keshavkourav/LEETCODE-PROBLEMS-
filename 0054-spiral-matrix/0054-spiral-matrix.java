import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int r = matrix.length;
        int c = matrix[0].length;

        int topRow = 0;
        int bottomRow = r - 1;
        int leftCol = 0;
        int rightCol = c - 1;

        int totalElements = 0;
        int total = r * c;

        while (totalElements < total) {

            // top row (left → right)
            for (int j = leftCol; j <= rightCol && totalElements < total; j++) {
                result.add(matrix[topRow][j]);
                totalElements++;
            }
            topRow++;

            // right column (top → bottom)
            for (int i = topRow; i <= bottomRow && totalElements < total; i++) {
                result.add(matrix[i][rightCol]);
                totalElements++;
            }
            rightCol--;

            // bottom row (right → left)
            for (int j = rightCol; j >= leftCol && totalElements < total; j--) {
                result.add(matrix[bottomRow][j]);
                totalElements++;
            }
            bottomRow--;

            // left column (bottom → top)
            for (int i = bottomRow; i >= topRow && totalElements < total; i--) {
                result.add(matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }

        return result;
    }
}
