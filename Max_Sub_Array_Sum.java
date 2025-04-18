public class Max_Sub_Array_Sum {
    public static void main(String[] args) {
        Max_SubArray_Sum obj = new Max_SubArray_Sum();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSubArraySum = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + maxSubArraySum);
    }

    public int maxSubArray(int[] nums) {
        // Brute Force Approach
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k < j; k++) {
                    curr_sum += nums[k];
                    max_sum = Math.max(curr_sum, max_sum);
                }
            }
        }
        return max_sum;
    }   
}
