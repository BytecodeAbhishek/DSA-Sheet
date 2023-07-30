public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }
    // Leetcode 238
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        //    for(int i=0; i<nums.length; i++){
        //        int mult = 1;
        //        for(int j=0; j<nums.length; j++){
        //            if(i != j) mult *= nums[j];
        //        }
        //        ans[i] = mult;
        //    }
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int mult = 1;
        for(int i=0; i<n; i++){
            prefix[i] = mult;
            mult *= nums[i];
        }
        mult = 1;
        for(int i=n-1; i>=0; i--){
            suffix[i] = mult;
            mult *= nums[i];
        }
        for(int i=0; i<n; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}
