public class BinomialCoefficient {


    public static int binCoeff(int n, int r){
        int factorial_n = factorial(n);
        int factorial_r = factorial(r);
        int factorial_nmr = factorial(n-r);

        int binCoeff = factorial_n /(factorial_r * factorial_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}

//error