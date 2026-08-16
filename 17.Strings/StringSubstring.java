public class StringSubstring{

    public static String subString(String str, int si, int ei){

        String substr = "";
        for(int i = si; i <ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main (String[]args){

        String str = "Hello, Welcome to Java Programming";

        // System.out.println(subString(str,0,5));

        // or
        System.out.println(str.substring(0,5));

    }
}