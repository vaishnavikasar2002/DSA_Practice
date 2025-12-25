
import java.util.*;

public class TwoDArray {

    public static boolean search(int matrix[][], int key) {
        //searching key 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + " , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;  //or  int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        //input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        // search
        search(matrix, 5);
        sc.close();

    }
}

// Input: any 9 no : 2 3 5 1 5 6 7 8 9
// Output: found at cell (0 , 2)
