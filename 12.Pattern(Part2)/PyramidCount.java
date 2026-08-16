public class PyramidCount {
    public static void pyramid_count(int n){

        //outer loop 
        int num = 1;
        for(int i=1; i<=n; i++){

        //space
            for(int j=1; j<=n-i; j++){
            System.out.print("\t");
        }
            for(int j=1; j<=i; j++){
            System.out.print(num + "\t\t");
            num++;
        }
            System.out.println("");
        }
    }
            public static void main(String[] args) {
            pyramid_count(5);
    }
}
