public class BinaryToDec {
    
    public static void binToDec(int binNum) { //binnum =101001
        int MyNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10; //Binary number चा शेवटचा digit काढतो. उदा. 101001 % 10 = 1 → शेवटचा digit 1.
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;  
        }
         System.out.println("decimal of " + MyNum +" = " + decNum);
    }
    public static void main(String[] args) {
        binToDec(101001);
        
    }
}
