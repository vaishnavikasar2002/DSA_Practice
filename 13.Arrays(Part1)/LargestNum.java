import java.util.*;
public class LargestNum {
    public static int largest_number_ex(int number[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;//+infinity
        for(int i=0; i<number.length; i++){
            if(largest < number[i]) {
                largest = number[i];
            }
            if(smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("samllest  vaule is :" + smallest);
        return largest;
       
    }
    public static void main(String[] args) {
        int number[] ={1,3,5,1,7,9,55};
        System.out.println("largest vaule is :" + largest_number_ex(number));

    }
}
