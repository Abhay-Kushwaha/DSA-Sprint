public class Max_SubArray_Sum {
    public static void main(String[] args) {
        Max_SubArray_Sum obj = new Max_SubArray_Sum();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSubArraySum = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + maxSubArraySum);
    }

    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            curr_sum += nums[i];
            max_sum = Math.max(curr_sum, max_sum);
            if (curr_sum < 0)
                curr_sum = 0;
        }
        return max_sum;
    }
}