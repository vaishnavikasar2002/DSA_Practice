// public class CallByValue{

//     public static void main(String[] args) {
//         //swap - value Exchage
//         int a = 10;
//         int b = 5;

//         //swap 
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " +a);
        
//         System.out.println("b = " +b);  
//     }
// }

// ---------Another way to swap using function ------------------------------------------------------------------------------------------------------

public class CallByValue{

    public static void swap (int a, int b) {
        //swap 
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        
        System.out.println("b = " +b);

    }
    public static void main(String[] args) {
        //swap - value Exchage
        int a = 5;
        int b = 10;
        swap(a,b); //function call

        

        
    }
}