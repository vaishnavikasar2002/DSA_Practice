//print sum of first n natural numbers using while loop ex 1+2+3+4+5 = 15
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n){
            sum += i; // sum = sum + i
            i++;
        }
          System.out.println("sum is : " +sum);
          sc.close();
        }
        
    }

