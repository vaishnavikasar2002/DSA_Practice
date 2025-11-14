
public class LinearSearchex {
    
    public static int linear_search_ex(int numbers[] , int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1; //key exit/////// kart nhi
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};

        int key = 10;

        int index = linear_search_ex(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("key is at index:" + index);
        }
     
    }
}
