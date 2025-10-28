// public class LargestOf3 {
//     public static void main(String[] args) {
//         int A = 1;
//         int B = 3;
//         int C = 6;

//         if((A>=B) && (A>=C)){
//             System.out.println("A is largest");
//         } else if (B>=C) {
//             System.out.println("B is largest");
//         } else {
//             System.out.println("C is largest");
//         }
//     }
// }

//-------------------------Q2  Write a program to input three numbers and print the largest.

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int A = sc.nextInt();

        System.out.print("Enter second number: ");
        int B = sc.nextInt();

        System.out.print("Enter third number: ");
        int C = sc.nextInt();

        // Find largest
        if (A >= B && A >= C) {
            System.out.println("A is the largest: " + A);
        } else if (B >= C) {
            System.out.println("B is the largest: " + B);
        } else {
            System.out.println("C is the largest: " + C);
        }

        sc.close();
    }
}
