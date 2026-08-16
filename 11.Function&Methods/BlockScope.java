public class BlockScope {

    public static void main(String[] args) {

        // code is executed within this block
        {
        int a = 10;
        System.out.println(a);
        }

// -----------------------------------------------------

        // code is not executed within this block
        // int p =20;
        // // System.out.println(a); //print error
        // {
        //     int a = 10;
        // }
        // System.out.println(p); //run
        // }
 
}
}
