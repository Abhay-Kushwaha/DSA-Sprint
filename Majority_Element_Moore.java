import java.util.*;

public class Majority_Element_Moore {
    public int majorityElement(int[] nums) {
        // Moore's Voting Algo
        int count = 1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                ans = nums[i];
            } 
            else if(ans==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Majority_Element_Moore obj = new Majority_Element_Moore();
        int arr[] = { 1, 2, 1, 3, 1, 2, 1 };
        System.out.println("Majority Element in Array is: "+obj.majorityElement(arr));
    }
}
