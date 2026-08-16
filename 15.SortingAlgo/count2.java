public class count2 {
    //another method mla eays vatli
    public static void counting_sort(int arr[]) {
        
        for(int i=0; i<arr.length; i++){
            if(arr[j] > max){
                max = arr[i];
            }
        }

        int freq[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
                freq [arr[i]]++;
        }

        for(int element=0; element<=max; element++){
                int count = freq [element];
                for(int j=1; j<count; j++){
                    arr[index] = element;
                    index++;
                }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,4,4,4,9,8,9,1,1,1};
        for(int i=0; i<arr.length; i++){
                System.out.println(arr[i] +" ");
        }
    }
}
