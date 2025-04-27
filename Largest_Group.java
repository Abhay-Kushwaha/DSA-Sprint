// Input: n = 13
// Output: 4
// Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
// [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
// There are 4 groups with largest size.

import java.util.HashMap;

public class Largest_Group {
    static int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max_size = 0;
        for (int i = 1; i <= n; i++) {
            int dig_sum = 0;
            int temp = i;
            while (temp > 0) {
                dig_sum += temp % 10;
                temp /= 10;
            }
            map.put(dig_sum, map.getOrDefault(dig_sum, 0) + 1);
            max_size = Math.max(max_size, map.get(dig_sum));
        }
        int c = 0;
        for (int size : map.values()) {
            if (size == max_size) {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Largest Group: "+ countLargestGroup(13));
    }
}
