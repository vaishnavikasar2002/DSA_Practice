import java.util.Scanner;

public class PrintOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("this is the even number");
        } else {
            System.out.println("this is the odd number");
        }
        sc.close();
    }
}
