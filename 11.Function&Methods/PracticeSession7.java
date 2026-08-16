import java.util.Scanner;

public class PracticeSession7 {
    
    //QS 1
    // public static boolean isEven(int n){
    //     if(n%2==1)
    //         return false; //odd no
    //     else
    //         return true; //even no 
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     boolean result = isEven(n); //true

    //     System.out.println(result);
    //     sc.close();
    // }

// ----------------------------------------------------------------------------------
    
    // //QS 2 sum of digits of number ex 517 = 13
    //  public static int sumOfDigits(int n){
    //     int sum = 0;
    //     while(n > 0) {
    //         int digit = n % 10;
    //         sum += digit;
    //         n = n / 10;
    //     }
    //     return sum;        
    // }
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     int sum = sumOfDigits(n);

    //     System.out.println(sum);
    //     sc.close(); 
    // }

// -------------------------------------------------------------------------------------------------------------------------------
    
    //QS 3 how to get reverse digits of number ex 517 = 715

    //  public static int sumOfReverse(int n){
    //     int rev = 0;
    //     while(n>0) {
    //         int digit = n%10;
    //         rev=rev*10+digit;
    //         n=n/10;
    //     }
    //     return rev;   
    // }
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     int rev = sumOfReverse(n);

    //     System.out.println(rev);
    //     sc.close(); 
    // }

// -------------------------------------------------------------------------------------------------------------------------------

    //QS4 check palindrome number ex 121 = palindrome , 123 = not palindrome
   
    //   public static int sumOfReverse(int n){
    //     int rev = 0;
    //     while(n>0) {
    //         int digit = n%10;
    //         rev=rev*10+digit;
    //         n=n/10;
    //     }
    //     return rev;   
    // }
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     int rev = sumOfReverse(n);

    //     if(n == rev){
    //         System.out.println("Palindrome");
    //     }else{
    //         System.out.println("not Palindrome");
    //     }
    //     sc.close(); 
    // }

// -------------------------------------------------------------------------------------------------------------------------------

    //Qs5 check prime number n=7 count 2 yeil bec 1,2,3,4,5,6,7 madhe 1 n 7 ne divisible ahe (divisible means remainder 0)

    public static void isPrimeNum(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0) 
            count++;
            }
            if(count==2){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime Number");
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        isPrimeNum(n);
     
        sc.close(); 
    }


}
