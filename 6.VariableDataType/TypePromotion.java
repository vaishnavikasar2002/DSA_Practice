import java.util.Scanner;

public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1st rule

        /* 
        char a = 'a';
        char b = 'b';
        System.out.println((int) (a));
        System.out.println((int) (b));
        System.out.println(a);
        System.out.println(b - a);
        */

        //2nd rule
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans); 
        sc.close();
    }
}
