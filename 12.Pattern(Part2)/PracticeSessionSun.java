
public class PracticeSessionSun {

    // Q1 
    // public static void main(String[]args) {
    //     int n = 5;
    //     for(int i = 1; i <= n; i++) {
    //         for(int j=1; j<=(n-i); j++) {
    //             System.out.print(" ");
    //         }
    //         for(int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
// ---------------------------------------------------------------------------------------------------
    //Q2 
    // public static void main(String args[]) {
    //     int n =5;
    //     for(int i=1; i<=n; i ++) {
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" "); //print spaces
    //         }
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(j); // print numbers left side
    //         }
    //         for(int j=i-1; j>=1; j--) {
    //             System.out.print(j); //print number right side
    //         }
    //         System.out.println();
    // }
    // }
// ---------------------------------------------------------------------------------------------------                                          
    
    // Q3
    // public static void main(String args[]) {
    //     int n=5;
    //     int num = 1;
    //     for (int i = 1; i <= n; i++) {

    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print("\t"); //spaces chya jagi "\t" use karu shakto
    //         }
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(num + "\t\t");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

// ---------------------------------------------------------------------------------------------------
    
    // Q4
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" "); //print spaces
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*"); //print stars
            }
            System.out.println();
        }
    }
}
