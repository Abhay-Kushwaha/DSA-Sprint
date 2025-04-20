import java.util.*;

public class Majority_Element_Optimised {
    public int majorityElement(int[] nums) {
        // Optimised Approach
        Arrays.sort(nums);
        int u = 1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                u++;
            } 
            else{
                u=1;
                ans=nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Majority_Element_Optimised obj = new Majority_Element_Optimised();
        int arr[] = { 2, 2, 1, 3, 1, 2, 2 };
        System.out.println("Majority Element in Array is: "+obj.majorityElement(arr));
    }
}
