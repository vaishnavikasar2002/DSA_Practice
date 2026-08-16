// import java.util.Scanner;
public class AssignmentQue {
    
// Q1 Write a Java method to compute the averageof three numbers..

    public static int num(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int c =2;

        int avg = num(a,b,c);
        System.out.println(avg);
    }

//--------------------------------------------------------------------------------------------------

// Q2 Write a Java method to check whether a number is even or odd.

    // public static boolean isEven(int n) {

    //     if(n % 2 == 0) {
    //         return true; 
    //     }
    //     else {
    //         return false;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num;

    //     System.out.println("Enter a number: ");
    //     num = sc.nextInt();

    //   if(isEven(num)) {
    //     System.out.println("Even Number");
    //   } else {
    //     System.out.println("Odd Number");
    //   }   

    //   sc.close();
    // }

// ---------------------------------------------------------------------------------------------

//Q3 write a java program to check if a number is a palindrome in java? 

    // public static int isPolindrome(int n) {
    //     int rev = 0;
    //     while (n > 0){
    //         int d = n % 10;
    //         rev = rev * 10 + d;
    //         n = n / 10;
    //     }
    //     return rev;
    // }

    //  public static void main (String[]args) {

    //     Scanner sc = new Scanner(System.in);
    //     int n= sc.nextInt();

    //     int rev = isPolindrome(n);

    //     if(n == rev){
    //         System.out.println("Palindrome Number");
    //     } else {
    //         System.out.println("Not a Palindrome Number");
         
    //     }
    //     sc.close();
    // }

// --------------------------------------------------------------------------------------------------

// Q4 Write a Java method to calculate .
    
    // public static void main(String[] args) {

    //     // a. Math.min(x, y) → दोन values मधून छोटी value देते
    //     int minValue = Math.min(10, 25);
    //     System.out.println("Minimum value: " + minValue);

    //     // b. Math.max(x, y) → दोन values मधून मोठी value देते
    //     int maxValue = Math.max(10, 25);
    //     System.out.println("Maximum value: " + maxValue);

    //     // c. Math.sqrt(x) → number चा square root देते
    //     double squareRoot = Math.sqrt(49);
    //     System.out.println("Square root of 49: " + squareRoot);

    //     // d. Math.pow(x, y) → x चा y power (x^y) काढते
    //     double powerValue = Math.pow(2, 5);
    //     System.out.println("2 raised to 5 is: " + powerValue);

    //     // e. Math.avg() → ❌ अशी method अस्तित्वात नाही
    //     // पण average manually काढू शकतो:
    //     double avg = (10 + 25 + 40) / 3.0;
    //     System.out.println("Average: " + avg);

    //     // f. Math.abs(x) → number ची absolute value देते (negative असल्यास positive करते)
    //     int absValue = Math.abs(-15);
    //     System.out.println("Absolute value of -15: " + absValue);
    // }

// ---------------------------------------------------------------------------------

// Q5  write a java to compute the sum of the digits in an integer?

    // public static int lastSum(int n) {
    //     int sum =0;
    //     while ( n > 0) {
    //         int digit = n % 10;
    //         sum += digit;
    //         n = n / 10;
    //     }
    //     return sum;
    // }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int sum = lastSum(n);
    //     System.out.println(sum);
    //     sc.close();

    // }

    }





  