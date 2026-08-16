//self practice code for linear search in java

public class LargestNum1{
    public static int largest_ex (int number[]){
      int largest = Integer.MIN_VALUE;
      int samllest = Integer.MAX_VALUE;
        for(int i =0; i<number.length;i++){
        if(largest < number[i]){
            largest = number[i];
        }
        if(samllest > number[i]){
            samllest = number[i];
        }      
      }
        System.out.println("samllest value is :" + samllest);
        return largest; 
    }


    public static void main(String[]args){
        int arr[] ={10,25,5,40,30};

        System.out.println("largest value is :" + largest_ex(arr));        
    }
}