public class TrappingRainwaterProblem {
    public static void main(String[] args) {

    }
    // Leetcode 42
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            if(height[i] > max) max = height[i];
            left[i] = max;
        }
        max=0;
        for(int i=n-1; i>=0; i--){
            if(height[i] > max) max = height[i];
            right[i] = max;
        }
        int ans =0;
        for(int i=0; i<n; i++){
            ans += Math.min(left[i],right[i]) - height[i];
        }
        return ans;
    }
}
