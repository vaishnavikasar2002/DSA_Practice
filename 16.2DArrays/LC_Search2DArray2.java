// Day4 - Arrays4 - search in 2d matricx (mediun level problem) 
// Leetcode - 240

public class LC_Search2DArray2 {

    public static boolean searchMatrix2(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.print("target is found :(" + i + " , " + j + ")");
                    return true;
                }
            }

        }

        System.out.print("target is not false");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;

        searchMatrix2(matrix, target);

    }
}
