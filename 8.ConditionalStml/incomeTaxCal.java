import java.util.Scanner;

public class incomeTaxCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 5000000 && income < 1000000) {
            tax = (int) (income * 0.2); //typecast kela
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is : " + tax);
        sc.close();
    }
}


// -----------------------------------------------------------------------------------------------------------------------------


//using self method

// import java.util.*;

// public class incomeTaxCal {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         int income = sc.nextInt();

//         if (income < 5) {
//             System.out.println("You have to apply 0% tax");
//         }
//         else if (income >= 5 && income <= 10) {
//             System.out.println("You have to apply 20% tax");
//         }
//         else {
//             System.out.println("You have to apply 30% tax");
//         }
//     }
// }