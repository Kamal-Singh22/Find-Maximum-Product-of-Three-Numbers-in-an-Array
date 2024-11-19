import java.util.Arrays;

public class MaximumProductOfThree {
    public static int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
       
        int n = nums.length;
        int maxProduct = Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3], 
            nums[0] * nums[1] * nums[n - 1]          
        );
        
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {-10, -10, 5, 2};
        System.out.println("Maximum Product: " + maximumProduct(nums));
    }
}
