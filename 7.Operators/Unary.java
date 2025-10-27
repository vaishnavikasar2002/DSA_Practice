public class Unary {
    public static void main(String[] args) {
        //pre increment
        int a = 5;
        int b = ++a;
        System.out.println("pre increment a : " + a );
        System.out.println("pre increment b : " + b );

        //post increment 
        int c = 5;
        int d = c++;
        System.out.println("post increment c : " + c );
        System.out.println("prost increment d : " + d );

        //pre decrement
        int e = 5;
        int f = --e;
        System.out.println("pre decrement e : " + e );
        System.out.println("pre decrement f : " + f );

        //post decrement 
        int g = 5;
        int h = g--;
        System.out.println("post decrement g : " + g );
        System.out.println("prost decrement h : " + h );


        //revison 
        int p = 33;
        int q = p--;
        System.out.println(p);
        System.out.println(q);

    }
}
