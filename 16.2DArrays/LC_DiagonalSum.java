// leetcode no :  1572
class LC_DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    primaryDiagonal += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    secondaryDiagonal += matrix[i][j];
                }
            }

        }
        System.out.println("primaryDiagonal: " + primaryDiagonal);
        System.out.println("secondaryDiagonal: " + secondaryDiagonal);
        return primaryDiagonal + secondaryDiagonal;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("sum:" + diagonalSum(matrix));
    }
}