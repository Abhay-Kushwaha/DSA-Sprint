public class Pair_Sum_Brute {
    public int[] Pair_sum(int[] nums, int target, int[] ans) {
        // BruteForce Approach
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Pair_Sum_Brute obj = new Pair_Sum_Brute();
        // Array is Already Sorted
        int arr[] = {1,2,3,4,5};
        int target = 9;
        int[] ans = {-1,-1};
        obj.Pair_sum(arr, target, ans);
        System.out.println("i="+ans[0]+" and j="+ans[1]);
    }
}
