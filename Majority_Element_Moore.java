import java.util.*;

public class Majority_Element_Moore {
    public int majorityElement(int[] nums) {
        // Moore's Voting Algo
        int count = 1;
        int ans = nums[0];
        int maxCount = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                ans = nums[i];
            }
        }
        if (maxCount > nums.length / 2)
            return ans;
        else
            return -1;
    }
    public static void main(String[] args) {
        Majority_Element_Moore obj = new Majority_Element_Moore();
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element in Array is: "+obj.majorityElement(arr));
    }
}
