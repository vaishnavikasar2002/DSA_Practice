// Day2 - Arrays2 - search in 2d matricx (mediun level problem) 
// Leetcode - 74

class LC_Search2DArray {
    public static boolean searchMatrix(int[][] matrix, int target) {
         for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    System.out.println("Found at (" + i + "," + j + ")");
                    return true;
                }
            }

         }
         System.out.println("Not Found");
         return false;
    }

    public static void main (String[] args) {
        int matrix[][]={
           {1,3,5,7},
           {10,11,16,20},
           {23,30,34,60}
        };

        int target=3;
        searchMatrix(matrix, target);  
       
    }
}