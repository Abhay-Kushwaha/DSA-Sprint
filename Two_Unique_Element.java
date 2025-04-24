import java.util.Arrays;
import java.util.Stack;

public class Two_Unique_Element {
    public int[] singleNumber(int[] arr) {
        Stack<Integer> st=new Stack<>();
        Arrays.sort(arr);
        for (int a:arr){
            if(!st.isEmpty() && a==st.peek()){
                st.pop();
            }
            else{
                st.push(a);
            }
        }
        int ans[]=new int[2];
        ans[1]=st.pop();
        ans[0]=st.pop();
        return ans;
    }

    public static void main(String[]args){
        int[] nums = { 1, 2, 1, 3, 2, 4 };
        int[] result = new Two_Unique_Element().singleNumber(nums);
        System.out.println("Unique elements: " + Arrays.toString(result));
    }
}
