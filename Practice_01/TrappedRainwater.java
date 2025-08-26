package Practice_01;

public class TrappedRainwater {
    public static int trappedRainwater(int height[]){
        // suppose each building width is 1
        int width = 1;

        // 1️⃣ Left side ka maximum nikalna he
        int leftMax[] = new int[height.length]; // har index ke liye left se max height store karenge

        leftMax[0] = height[0]; // first pillar ke left me kuch nahi hai, isliye wahi max hai

        // array ke start se chalna hai
        for (int i = 1; i < height.length; i++) {
            // har ek position par decide karna hai ki max konsa hai:
            // - current height[i]
            // - ya phir uske pichle tak ka max (leftMax[i-1])
            leftMax[i] = Math.max(height[i], leftMax[i - 1]); // pichle wale se compare karke max lo
        }

        // 2️⃣ Right side ka maximum nikalna he
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1]; // last pillar ke right me kuch nahi hai

        // array ke end se chalna hai (kyunki right ka max dekhna hai)
        for (int i = height.length - 2; i >= 0; i--) {
            // har ek position par decide karna hai ki max konsa hai:
            // - current height[i]
            // - ya phir uske aage tak ka max (rightMax[i+1])
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // age wale se compare karke max lo
        }

        // 3️⃣ Pani calculate karna
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            // current pillar ke upar pani kitna ruk sakta hai?
            // pani ka level = min(leftMax bound, rightMax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // ruka hua pani = pani ka level - pillar ki height
            // width = 1 hai isliye *width lagaya hai
            trappedWater = trappedWater + (waterLevel - height[i]) * width;
        }

        return trappedWater;

    }



    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int output = trappedRainwater(height);
        System.out.println("Output : "+ output);
    }
}