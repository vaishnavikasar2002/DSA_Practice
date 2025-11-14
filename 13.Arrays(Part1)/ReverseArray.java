public class ReverseArray {
    
    public static void Reverse_Array(int number[]){
        int start = 0 , end = number.length-1;
         
        while(start < end){

            //swap
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;

            start++;// start 1 index ne pudhe jail
            end--; // end 1 index ne maghe yeila
        }

        //comparision
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
  
        Reverse_Array(number);

        //print
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}

