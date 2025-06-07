import java.util.Stack;

public class Next_Greater_Element {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(nums2[i]);
        }
        int n2 = nums1.length;
        int[] res = new int[n2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    res[i] = nge[j];
                    break;
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Next_Greater_Element solution = new Next_Greater_Element();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
