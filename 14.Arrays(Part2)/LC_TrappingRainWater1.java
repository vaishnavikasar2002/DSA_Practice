// DSA Sheet - 42
//Exampple 1
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

public class LC_TrappingRainWater1 {

    public static int trapped_rainwater(int height[]) {
        int n = height.length;

        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // calculate trapped water
        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //waterLevel = min(leftmax bound,rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterLevel - height
            trappedWater = trappedWater + waterLevel - height[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapped_rainwater(height));
    }
}
