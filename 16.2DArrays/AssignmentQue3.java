public class AssignmentQue3{
    
    // Method to find and print transpose
    public static void transposeMatrix(int[][] matrix) {

        int rows = matrix.length;//2
        int cols = matrix[0].length;//3

        int[][] transpose = new int[cols][rows]; //row transpose col karaych mhanun col 1st ghetla

        // transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; //we are swapping rows with cols
            }
        }

        // print transpose
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        transposeMatrix(matrix); // method call
    }
}