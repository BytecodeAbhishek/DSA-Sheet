// https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubArray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
    private static int max(int[] nums){
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currSum = Math.max(nums[i] , currSum+nums[i]);
            maxSum = Math.max(maxSum , currSum);
        }
        return maxSum;
    }
}
