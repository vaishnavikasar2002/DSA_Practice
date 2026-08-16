// public class Factorial {

//     public static int factorial(int n){
//         int f = 1;
//         for(int i=1;i<=n;i++){
//             f = f * i;
//         }
//         return f;
//     }
//     public static void main(String[] args) {
       
//         System.out.println(factorial(4));
//     }
// }

//-------directly print factorial without function

// public class Factorial {
//     public static void main(String[] args) {
//         int n = 5;  // number to find factorial
//         int fact = 1;

//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }

//         System.out.println("Factorial of " + n + " is: " + fact);
//     }
// }



// -----practices examples

public class Factorial {

    public static void main(String[] args) {
       int n = 6;
       int f = 1;
       for (int i =1; i<=n; i++) {
        f = f * i;
       }
       System.out.println(f);
    }
}