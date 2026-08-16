// import java.util.Scanner;
public class Strings {

    public static void main(String[] args) {

        // topic : what is strings
        char arr[] = {'a', 'b', 'c'};
        String str = "mauu";
        // or
        String str1 = new String("dog");

        //Note = Strings are immutable in java - cannot be change
// -------------------------------------------------------------------------------------------------------------------------
        
        //topic :  take input from the user

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println("My Name is : " + name);

// --------------------------------------------------------------------------------------------------------------------------------
        
        
        //  topic - String length

        // String fullName = "Vaishnavi Kasar";
        // System.out.println("Length is : " + fullName.length());

// ----------------------------------------------------------------------------------------------------------------------
        
        // topic - String Concatenate

        // String firstName = "Chetan";
        // String lastName = "Pawar";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

// ----------------------------------------------------------------------------------------------------------------------------------


        // topic - String charAt Methods

        String firstName = "Chetan";
        String lastName = "Pawar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.charAt(0));
    }

}
