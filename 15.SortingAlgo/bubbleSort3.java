import java.util.*;
public class bubbleSort3 {
    
    public static void bubble_sorting_ex(int arr[]) {

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; i++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
               

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,6,4,2,1};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
