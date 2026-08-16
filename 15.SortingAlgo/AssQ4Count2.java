import java.util.*;
public class AssQ4Count2 {
    
    public static void counting_sort2(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
           largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int j=0; j<arr.length; j++){
            count[arr[j]]++;
        }
        
        //sorting
        int j=0;
       
        for(int i=0; i<=largest; i++){
            
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        counting_sort2(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
