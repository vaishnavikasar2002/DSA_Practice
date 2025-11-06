import java.util.Scanner;

public class Assignment {

    // Qs 1
    // public static void main(String[] args) {
    // for(int i=0; i<5; i++){
    // System.out.println("hello");
    // i+=2;
    // }
    // }

    /// QS 2
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("enter the number of total inputs :");
    // int n = sc.nextInt();//5

    // int evenSum = 0;
    // int oddSum = 0;

    // while(n>0){
    // int currNum = sc.nextInt();

    // if(currNum % 2 == 0) {
    // evenSum = evenSum + currNum;
    // } else {
    // oddSum = oddSum + currNum;
    // }

    // n--;//4 //3 //2 //1
    // }
    // System.out.println("sum of even inputs is:" + evenSum);
    // System.out.println("sum of odd inputs is:" + oddSum);
    // sc.close();
    // }

    // Qs3
    // public static void main(String[] args) {
    // Scanner sc = new Scanner (System.in);
    // int n = sc.nextInt();
    // int fact = 1;

    // for(int i=1; i<=n; i++){
    // fact = fact * i;

    // }

    // System.out.println("factorial is : " +fact);
    // sc.close();
    // }

    // QS4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //10

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}
