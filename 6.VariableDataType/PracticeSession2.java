// doubts sessions

import java.util.Scanner;

public class PracticeSession2 {

    public static void main(String[] args) {
        System.out.println("Enter your full name:");
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("you entered: " + userName);
        System.out.println("Your age is: " + age);

        // type promotion
        long a = 10;
        float b = 25.5f;
        System.out.println(a + b);

        float a1 = 10.4f;
        double b1 = 2589;
        System.out.println(a1 + b1);
    }
}
