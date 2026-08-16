public class pyramid {

    public static void pyramidexample(int n ){
        //outer loop
        for(int i=n; i>=1;i--){

            
            //space
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          
          //star
          for(int j=1; j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramidexample(5);

    }
}
