public class NumIncrement {

    public static void num_increment_pyaramid(int n){

        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i; j++ ){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        num_increment_pyaramid(4);
    }
    
}
