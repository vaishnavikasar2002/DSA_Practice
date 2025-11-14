
public class BinarySearch {
    
    public static int binary_search_ex(int number[],int key) {
        int start = 0 , end = number.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            //comparision
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){ //right
                start = mid+1;
            } else{ //left
                end = mid - 1;
            }
        }
        return -1; // array madhe exit nasel kart tr 
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key = 90;
        System.out.println("index for key is : " + binary_search_ex(number,key));
    }
}
