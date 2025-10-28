import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {

        // if else stml
        // Q1 Check if a number is positive or negative

        // int number = 2901;

        // if(number >= 0) {
        // System.out.println(number + " is Positive Number" );

        // } else {
        // System.out.println("Negative");
        // }

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        // else if
        // Q1 check the grade based on marks (A,B,C Fail)

        int marks = 90;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 45) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // Q2 Check number type (positive, negative,zero)

        int num = 0;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    //     // Q3 Day of the week

        int day = 3;
        if (day == 1) {
            System.out.println("Day 1 : Monday");

        } else if (day == 2) {
            System.out.println("Day 2 : Tuesday");
        } else if (day == 3) {
            System.out.println("Day 3 : Wednesday");
        } else if (day == 4) {
            System.out.println("Day 4 : Thursday");
        } else if (day == 5) {
            System.out.println("Day 5 : Friday");
        } else if (day == 6) {
            System.out.println("Day 6 : Thursday");
        } else if (day == 7) {
            System.out.println("Day 7 : Friday");
        } else {
            System.out.println("sunday");
        }

  

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //ternary operators
    // QS1 find greater Number
    int a = 45, b = 90;

    int max = (a > b) ? a : b;
    System.out.println("ternary op : " + max);

    
    // Qs2  eligible to vote or not using ternary op

    int age = 48;

    String ans = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
    System.out.println(ans);
    

    // QS 3
     String str = "";

     String message = (str.isEmpty()) ? "String is empty" : "String is not empty";
     System.out.println(message);

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Switch Stml

    int month = 10;

    switch (month) {
        case 1: System.out.println("Jan");
                break;
        
        case 2: System.out.println("Feb");
                break;

        case 3: System.out.println("March");
                break;
        default:System.out.println("wrong Number");
            break;
    }

     }
}
