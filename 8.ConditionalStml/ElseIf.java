// public class ElseIf {
//     public static void main(String[] args) {
//         int age = 3; 
//         if(age>=18){
//             System.out.println("adult");
//         } else if (age>=13 && age<18){
//             System.out.println("teenager");
//         } else {
//             System.out.println("child");
//         } 
//     }
// }

// -------Q2 Accept time in 24-hour format and display greeting: 5–11 → Good Morning ,12–16 → Good Afternoon ,17–20 → Good Evening ,Otherwise → Good Night

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();

        if (hours >= 5 && hours < 11) {
            System.out.println("Good Morning");
        } else if (hours >= 12 && hours < 16) {
            System.out.println("Good Afternoon");
        } else if (hours >= 17 && hours < 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }

        sc.close();
    }
}