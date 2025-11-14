
import java.util.*;

public class OperationArray {

    public static void main(String[] args) {
        // topic: create an arrays

        // int marks[] = new int[50];
        // int number[] = {2,3,4}; 
        // string fruit[] = {"appple","banana","peru"};

// ------------------------------------------------------------------------------------
        
        //topic : output

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        // normal variable vr input ghenya sathi
        //    int phy;
        //    phy=sc.nextInt();

        // marks arr lenght
        // System.out.println("length of array = " + marks.length); //100 ahe, me store kele 3arr jar me 120 store kele tr err yeila karn arr size 100 ahe

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy :" + marks[0]);

        System.out.println("chem :" + marks[1]);

        System.out.println("bio :" + marks[2]);


        // topic : Update 

        //    marks[2] = 90;
        //    or
           marks[2]=marks[2] + 10; //origin marks madhe 10 add hotila 
           System.out.println("bio :" + marks[2]);

           int percentage = (marks[0] + marks[1] + marks[2])/3;
           System.out.println("percentage :" +percentage + "%");
        sc.close();
    }

}
