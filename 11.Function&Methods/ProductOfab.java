public class ProductOfab{
 
    public static int multiply(int a,int b) {
        int product = a*b;
        return product;
    }

public static void main(String args[]) {
    int a=3;
    int b=5;
    int prod = multiply(a,b);
    System.out.println ("a * b = "+prod);
    prod = multiply(14,2);//(14,2 type kele tar 14 ahe ani 2 b)
    System.out.println ("a * b = "+prod);
    }

}