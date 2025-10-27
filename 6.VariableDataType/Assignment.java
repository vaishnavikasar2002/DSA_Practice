import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // example 1

        /*
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int c = sc.nextInt();
         * 
         * int avg = (a + b + c) / 3;
         * System.out.println("average of 3 numbers is : " + avg);
         * 
         * sc.close();
         */

        // example 2 area of a circle

        /*
         * int side = sc.nextInt();
         * int area = side * side;
         * System.out.println("area of a circle is : " + area);
         * sc.close();
         */

        // example 3
        /*
         * float pencil = sc.nextFloat();
         * float pen = sc.nextFloat();
         * float eraser = sc.nextFloat();
         * 
         * float total_cost = pen + pencil + eraser;
         * float gst = (total_cost) * 18 / 100;
         * float bill = (total_cost + gst);
         * 
         * System.out.println("Total cost is :" + total_cost);
         * System.out.println("Total gst is :" + gst);
         * System.out.println("Total bill amount is :" + bill);
         * 
         * sc.close();
         */

        // example 4

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
                        // float and bite madhe ky motha float so ans float again check next condition int and char madhe kon moth so on....

        System.out.println(result);

        //example 5 

        int $ = 24;
        System.out.println($);

        //ex 

        long a = 10;
        float p = 25.5f;
        System.out.println(a+p);

        sc.close();
    }
}
