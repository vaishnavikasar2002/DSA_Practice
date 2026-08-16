public class LeetcodeTrappedWater {
    
    public static int trapped_water(int height[]){
        int n = height.length;
        //calculate left array

        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i=1; i<n; i++){
            LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
        }

        //calculate right array 
        int rightMax[] = new int[n];
        rightMax[n-1]= height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int ans = 0;

        //loop
        for(int i=0; i<n; i++){

            //calculate min value(leftMax, rightMax)
            int val = Math.min(LeftMax[i], rightMax[i]);

            //calculate trapped rainwater
            ans += (val-height[i]);
        }

            return ans;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println("total trapped waterrain :" + trapped_water(height));
        
    }
}
