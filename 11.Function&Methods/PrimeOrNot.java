public class PrimeOrNot {
    
    // public static boolean isPrime(int n){
    // if(n==2) {
        //     return true;
        // }
        
    //     boolean isPrime = true;
    //     for(int i=2; i<=n-1;i++){
    //         if(n % i == 0) { //completely divided
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    
    // public static void main(String[] args) {
    //     System.out.println(isPrime(39));
    // }

// ---------- 2nd ways = check prime(optimized)--------------------------------------------------------------------

    public static boolean isPrime(int n) {
        if(n==2) {
            return true;
        }
        for(int i =2; i<=Math.sqrt(n); i++) {
            if(n % i ==0 ) {
                return false; //no is not prime
            }
        }
        return true; //no is prime

    } 

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}
