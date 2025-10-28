
// public class Assignment {

// ------ ques 1 : Write a java program to get a number from the user and print whether it is positive or negative.

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a Number:");
//         int num = sc.nextInt();

//         if (num > 0) {
//             System.out.println("positive");
//         } else {
//             System.out.println("negative");
//         }
//         sc.close();
//     }
// }

// -------- ques 2 : finish the following code so that it print you have a fever you temperture is above 100 and other prints you dont have fever

// public class Assignment {
//     public static void main(String[] args) {
//         double temp = 103.5;
//         if (temp > 100) {
//             System.out.println("You have a fever");
//         } else {
//             System.out.println("You dont have fever");
//         }
//     }
// }

//------ Ques 3 : write java program to input week num(1-7) and print day of week name

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("Thusday");
                break;

            case 5:
                System.out.println("Saturday");
                break;

            case 6:
                System.out.println("SUnday");
                break;

            default:
                System.out.println("not a num in the week");
                sc.close();
        }
    }
}

// QS 5

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int year = sc.nextInt();

// if(year % 4 == 0){
// if(year % 100 == 0){
// if(year % 400 == 0){
// System.out.println(year + " Leap year");
// } else {
// System.out.println("Not a leap year");
// }
// } else {
// System.out.println("Leap year");
// }
// }else{
// System.out.println("not a leap year");
// }

// }

// }
