import java.util.*;
public class matrices2 {
    
    //largest number 
    public static boolean search(int matrix[][],int key){
        int largest =Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j] > largest){
                    largest= matrix[i];
                    System.out.println("this is largest value :"+ i);
                    return largest;
                }
            }
        }
     
    }
   
    public static void main(String[] args) {
        
    int matrix[][] = new int [5][4];
    int n =5, m = 4;

    Scanner sc= new Scanner(System.in);
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++) {
            matrix[i][j]=sc.nextInt();
        }
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++) {
           System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
   
    sc.close();
    }
   
}
