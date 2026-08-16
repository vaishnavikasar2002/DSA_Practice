// function overloading using data type
public class FunctionUseDataTy {
    
    public static int sum (int a,int b){
        return a + b;
    }
    
    public static float sum (float a , float b){
        return a + b;
    }
    
    
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2.2f, 5.5f));
    }
}
