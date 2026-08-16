public class number {
    
    public static void number_ex(int n) {
        //outer loop
        for(int i=1; i<=n; i++){

            //space
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
               
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        number_ex(6);
        
    }
}

//pattern format 
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1