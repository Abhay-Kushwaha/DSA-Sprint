public class Pair_Sum_Optimised {
    public int[] Pair_sum(int[] nums, int target, int[] ans) {
        // BruteForce Approach
        int i = 0;
        int j = nums.length-1;
        int ps = 0;
        while(i<j){
            ps=nums[i]+nums[j];
            if (ps < target) {
                i++;
            }
            else if (ps > target) {
                j--;
            }
            else {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Pair_Sum_Optimised obj = new Pair_Sum_Optimised();
        // Array is Already Sorted
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 9;
        int[] ans = { -1, -1 };
        obj.Pair_sum(arr, target, ans);
        System.out.println("i=" + ans[0] + " and j=" + ans[1]);
    }
}