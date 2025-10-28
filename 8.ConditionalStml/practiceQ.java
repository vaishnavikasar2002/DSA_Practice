//QS 1

// import java.util.Scanner;

// public class practiceQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num =  sc.nextInt();
//         if(num>50){
//             System.out.println("this number is minimum");
//         }else{
//             System.out.println("this number is maximum");
//         }

//         sc.close();
//     }
// }


//QS2 if else stml

// import java.util.Scanner;

// public class practiceQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age of Person");
//         int age=sc.nextInt();
//         if(age>=18){
//             System.out.println("eligible for marriage");
//         }else{
//             System.out.println("not eligible for marriage");
//         }
//         sc.close();
//     }
//     }
   
//QS3 else if 

// import java.util.Scanner;

// public class practiceQ {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the amounts");
//         int  BasicSalary = sc.nextInt();
//         if(BasicSalary<20000){
//             System.out.println(BasicSalary +"k saraly for watchmen");
//         }else if (BasicSalary >=20000 && BasicSalary<=50000){
//             System.out.println("client salary");
//         }else {
//             System.out.println("manager");
//         }
//         sc.close();
//     }
// }

//QS 4

public class practiceQ{

    public static void main (String[] args){
        int num = 1;
        switch(num) {
            case 1:
              System.out.println("MALE");
            break;

            case 2 :
                System.out.println("FEMALE");
                break;
            default :
                System.out.println("gay");  
        }
    }
}