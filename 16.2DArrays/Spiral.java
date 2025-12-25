// Shrddhaa methods 

// public class Spiral {
//     public static void print_spiral(int matrix[][]) {
//         int startRow = 0; 
//         int endRow = matrix.length-1;
//         int startCol = 0;
//         int endCol = matrix[0].length-1;
//         while(startRow <= endRow && startCol <= endCol) {
//             //top 
//             for(int j=startCol; j<=endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }
//             //right
//             for(int i=startRow+1; i<=endRow; i++) { //4 part print nhi karaych mhanun +1 kela
//                 System.out.print(matrix[i][endCol] + " ");
//             }
//             //bottom
//             for(int j=endCol-1; j>=startCol; j--) {
//                 if(startRow == endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }
//             //left
//             for(int i=endRow-1; i>=startRow+1; i--) {
//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};
//         print_spiral(matrix);
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// chatgpt methods (easy)
public class Spiral {

    public static void printSpiral(int matrix[][]) {
        int top = 0; //0
        int bottom = matrix.length - 1; //3
        int left = 0; //0
        int right = matrix[0].length - 1; //3

        while (top <= bottom && left <= right) {
            
            //top 
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            //right
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            //bottom
            if (top <= bottom) {// to avoid duplicate row
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // left 
            if (left <= right) { // to avoid duplicate column                        
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }

        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}


// ---------------------------------------------------------------------------------------------------------------------------

// Explanation
// Aapka matric -
// 1   2   3   4
// 5   6   7   8
// 9  10  11  12
// 13 14  15  16

// Index form(row,col):
// (0,0) (0,1) (0,2) (0,3)
// (1,0) (1,1) (1,2) (1,3)
// (2,0) (2,1) (2,2) (2,3)
// (3,0) (3,1) (3,2) (3,3)

// Initial values :
// top = 0
// bottom = 3
// left = 0
// right = 3


// **Top Row **
// ```for (int i = left; i <= right; i++) {
//     System.out.print(matrix[top][i] + " ");
// }
// top++;```
// > matrix[top][i]
// > top → fixed row
// > i → column move karta
// > Left → Right traversal
// > top++ → boundary shrink

// **RIGHT (top → bottom)**
// `for (i = top; i <= bottom; i++)
//     print(matrix[i][right]);
// right--;`

// > ⬇️ Last column print, phir right boundary hatao.

// **BOTTOM (right → left)**
// `if (top <= bottom)
//     for (i = right; i >= left; i--)
//         print(matrix[bottom][i]);
// bottom--;`

// > ⬅️ Last row ulta print, phir bottom boundary hatao.

// **LEFT (bottom → top)**
// `if (left <= right)
//     for (i = bottom; i >= top; i--)
//         print(matrix[i][left]);
// left++;`

// > ⬆️ First column upar ki taraf print, phir left boundary hatao.

// ** This Repeats **
// *Jab tak boundaries cross na ho jaayein.*

// ***🔁 while loop ka matlab***
// `while (top <= bottom && left <= right)`

// > -> Jab tak matrix ke andar elements bache hue hain, tab tak spiral chalao.