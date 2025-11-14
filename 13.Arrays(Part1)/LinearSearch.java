public class LinearSearch {
    
    public static int linear_ex(String string[],String key) {
        for(int i=0; i<string.length; i++){
            if(string[i] == key){
               return i;
            }
        }
            return -1;
        }
  
    public static void main(String[] args) {
        String string[]={"pizza","dosa","samosa","panipuri"};
        String key = "momose";

        int index = linear_ex(string,key);
        if(index == -1){
            System.out.println("not found menu");
        }else{
            System.out.println("the ley is at index:" + index);
        }
    }
}
