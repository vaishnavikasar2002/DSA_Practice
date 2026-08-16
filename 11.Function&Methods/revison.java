
// Q1 
// public class revison {
    
//     public static void printmyName() {
//         System.out.println("My name is Vaishnavi");
//     }
//     public static void main(String[] args) {
//         printmyName();
//     }
// }

// Q1 same as 1st - input from user
// import java.util.*;

// public class revison {
    
//     public static void printmyName(String name) {
//         System.out.println(name);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         printmyName(name); //call function
//         sc.close();
//     }
// }


// Q2 add 2 num n return the sum

// import java.util.*;
// public class revison {
//     public static int addNumbers(int a, int b) {
//         return a + b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = addNumbers(a, b);
//         System.out.println("sum of 2 numbers is : " + sum);
//         sc.close();
//     }
// }

// Q3 - fun to multiply 2 numbers and  return the product

import java.util.*;

public class revison {

    public static int multipleNum(int a,int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multipleNum(a,b);
        System.out.println("product of 2 numbers is : " + product);

    }
}