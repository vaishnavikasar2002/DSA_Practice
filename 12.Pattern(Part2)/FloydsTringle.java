public class FloydsTringle {
    
    public static void Floyds_Tringle(int n){
        //outer loop
        int counter=1;
        for(int i=1; i<=n;i++){
            //inner - how many time will counter be printed
            for(int j=1; j<=i;j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyds_Tringle(6);
    }
}
