import java.util.Scanner;

public class FunctionDemo { //single cls madhe multiple function create karu shakto
    
    public static void printHelloWorld(){
        System.out.println("helllo world");
        System.out.println("helllo world");
        System.out.println("helllo world");
        System.out.println("helllo world");
        System.out.println("helllo world");
        // return;
    }

 
    public static int calculateSum(int a, int b){ // syntax with parameters // parameter or formal parameter
        int sum = a+b;
        return sum;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); //arguments
        System.out.println("sum is :" +sum);
        sc.close();
        // printHelloWorld(); //function call

    }
}
