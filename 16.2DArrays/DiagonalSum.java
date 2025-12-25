// public class DiagonalSum {

//     public static int  Diagonal_Sum(int matrix[][]) {
//         int sum = 0;

//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++){
//                 if(i==j) {
//                     sum += matrix[i][j];
//                 }
//                 else if(i+j == matrix.length-1){
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         return sum;

//     } 

//     public static void main(String[] args) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};
//         System.out.println(Diagonal_Sum(matrix)); //direct sum print karta
       
//     }
    
// }


public class DiagonalSum {

    public static int  Diagonal_Sum(int matrix[][]) {
        int PrimaryDiagonal= 0 , SecondaryDiagonal = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
                if(i==j) {
                    PrimaryDiagonal += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    SecondaryDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("Primary Diagonal = "  + PrimaryDiagonal );
        System.out.println("Secondary Diagonal = " + SecondaryDiagonal);
        return PrimaryDiagonal + SecondaryDiagonal;

    } 

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        System.out.println("Sum = " + Diagonal_Sum(matrix));
       
    }
    
}