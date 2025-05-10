import java.util.*;
public class Subarray_with_equal_01 {
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // add your code here
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                arr[i] = -1;
            sum += arr[i];
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1};
        // int arr[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1 };
        int n = arr.length;
        System.out.println(countSubarrWithEqualZeroAndOne(arr, n));
    }
}