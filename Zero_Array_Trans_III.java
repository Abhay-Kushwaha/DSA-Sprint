import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Zero_Array_Trans_III {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length, q = queries.length;
        List<List<Integer>> range_end = new ArrayList<>();
        for (int i = 0; i < n; i++)
            range_end.add(new ArrayList<>());
        for (int[] r : queries) {
            range_end.get(r[0]).add(r[1]);
        }
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        int[] cancel_c = new int[n + 1];
        int active_rmv = 0;
        for (int i = 0; i < n; i++) {
            active_rmv += cancel_c[i];
            for (int end : range_end.get(i)) {
                max_heap.offer(end);
            }
            int curr_stg = nums[i];
            while (curr_stg > active_rmv && !max_heap.isEmpty() && max_heap.peek() >= i) {
                int k = max_heap.poll();
                cancel_c[k + 1]--;
                active_rmv++;
            }
            if (curr_stg > active_rmv)
                return -1;
        }
        return max_heap.size();
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4 };
        int[][] queries = { { 0, 3 }};
        // int[] nums = { 2, 0, 2 };
        // int[][] queries = { { 0, 2 }, { 0, 2 }, { 1, 1 } };

        Zero_Array_Trans_III obj=new Zero_Array_Trans_III();
        int result = obj.maxRemoval(nums, queries);
        System.out.println(result);
    }
}