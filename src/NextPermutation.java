import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int [] nums ={1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void nextPermutation(int[] nums){
        // Step -1 traverse from the back and find the first element
        // which is less then the next  element
        int index1 = -1;
        int index2 = -1;
         for(int i=nums.length-2; i>=0; i--){
             if(nums[i] < nums[i+1]){
                 index1 = i;
                 break;
             }
         }
         // if breaking condition is not found that means that the current permutation
        // is the last so jst reverse the array
         if(index1 == -1){
             reverse(nums,0);
         }
        // Step -2 traverse from the back and find the first element
        // which is grater then the index1  element
        else {
             for (int i = nums.length - 1; i >= index1; i--) {
                 if (nums[i] > nums[index1]) {
                     index2 = i;
                     break;
                 }
             }
             // Step 3 swap the index 1 and 2 elements
             swap(nums, index1, index2);
             //Step 4 reverse the array after index+1
             reverse(nums, index1 + 1);
         }
    }

    private static void reverse(int[] nums, int index) {
        int i =index;
        int j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int a , int b){
        if(a == b) return;
        // swapping using XOR
        nums[a] = nums[a] ^ nums[b];
        nums[b] = nums[a] ^ nums[b];
        nums[a] = nums[a] ^ nums[b];
    }
}
