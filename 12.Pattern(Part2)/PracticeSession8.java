
public class PracticeSession8 {

    // Q1 square pattern

    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i=1; i<=n; i++ ){
    //         for(int j=1; j<=n ; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
// -----------------------------------------------------------------------------------------------------
    // Q2 botttom left triangle

    // public static void main(String[] args) {
    //     int n =5;
    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1; j <= i; j++){
    //           System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // another ways

    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             if (i - j >= 0) { //positive value 0,1,2,3
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
// --------------------------------------------------------------------------------
    // Q3 top right triangle

    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j < i; j++) { //j loop → 1 < 1 ❌ (no spaces)
    //              System.out.print(" ");
    //         }
    //         for(int k = i; k <= n; k++) { 
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // another way
    
    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             if (i - j <= 0) { //positive value 0,1,2,3
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
//-----------------------------------------------------------------------------------------------------
    // Q4 bottom right triangle

    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i = 1; i <= n; i++) {
    //         //space
    //         for(int j = 1; j <= n-i ; j++){
    //             System.out.print(" ");
    //         }
    //         //star
    //         for(int k = 1; k <= i ; k++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
//------------------------------------------------------------------------------------------------------------------------------------

    // Q5 top right triangle number (same logic as Q3)

    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j < i; j++) { //j loop → 1 < 1 ❌ (no spaces)
    //              System.out.print(" ");
    //         }
    //         for(int k = i; k <= n; k++) { 
    //             System.out.print(i);
    //         }
    //         System.out.println();
    //     }
    // } 
// ----------------------------------------------------------

    // Q6  (same logic as Q2) * chya jager j print karaycha
    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

// -----------------------------------------------------------------------------------------------
    
    // Q7 FloydsTringle

    //  public static void main(String[] args) {
    //     int n = 5;
    //     int count = 1;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(count +" ");
    //             count++;
    //         }
    //         System.out.println();
    //     }
    // }


// -----------------------------------------------------------------------------------------------------------

    //  Q8 X pattern 
     public static void main(String[] args) {
        int n = 5; // Size of the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' 
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space
                }
            }
            System.out.println();
        }
    }

}


        