
public class StringCompare {

    public static void main (String[]args){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        // 1st way to compare strings

        // if(str1 == str2){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(str1 == str3){
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

// ----------------------------------------------------------------------------------------------------------------

        // 2nd way to compare strings(good way)
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(str1.equals(str3)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}