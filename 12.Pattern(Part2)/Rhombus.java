public class Rhombus {
    
    public static void Rhombus_ex(int n){
        //outer loop 
        for(int i=1; i<=n; i++){
            //inner loop space
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println("");
        }
    }
    public static void main(String[] args) {
        Rhombus_ex(5);
    }
}
