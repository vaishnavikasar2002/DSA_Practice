import java.util.Scanner;

public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addision of a & b : " + (a+b));
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        sc.close();
    }
}

// ---------------Q Write a Java program to demonstrate the use of arithmetic operators (+, -, *, /, %).

// public class ArithmeticOp {
//     public static void main(String args[]) {
//         int a = 3;
//         int b = 5;
//         System.out.println("Addition of a & b : " + (a + b));
//     }

// }
