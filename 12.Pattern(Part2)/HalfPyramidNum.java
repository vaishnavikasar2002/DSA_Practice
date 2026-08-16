public class HalfPyramidNum {
    
    public static void inverted_half_pyaramid_withNum(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyaramid_withNum(5);
    }
}
