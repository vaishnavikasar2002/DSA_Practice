//self practice code for linear search in java

public class linearSearch1 {
    
     public static int linearSearchEx(int arr[], int key){
         for (int i = 0; i < arr.length; i++){
             if(arr[i] == key){
                 return i;
             }
         }
         return -1;
     }
    public static void main(String[] args) {
        int arr[] = {5, 12, 9, 21, 30};
        int key = 21;
        
        int result = linearSearchEx(arr,key);
        
        if(result == -1){
            System.out.println("Not Found");
            } else{
                System.out.println("key is found at index : " + result);
            }
        }
    }
