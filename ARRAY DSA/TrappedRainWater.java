public class TrappedRainWater {
    public static int trapped_rainwater(int height[], int width) {
        int n = height.length;
        // claculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0]; // for i = 0 leftmax = 0 index value
        for(int i = 1; i < n; i++) { // forward loop
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        // claculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) { // backward loop
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedWater = 0;
        //loop
         for(int i=0; i<n; i++) {
            // waterlevel  = min(leftmax bound , rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            //trapped water = (waterlevel - height[i]) * width
            trappedWater = trappedWater + (waterLevel - height[i]) * width;
         }
         return trappedWater;
    }
    



    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int width = 1;
        System.out.println("Trapped Rain Water : "+trapped_rainwater(height, width));
    }
}
