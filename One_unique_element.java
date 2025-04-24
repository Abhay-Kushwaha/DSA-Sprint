public class One_unique_element {
    public int singleNumber(int[] arr) {
        int ans = arr[0];
        for (int i=1;i<arr.length;i++) {
            ans = ans^arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 4, 3 };
        One_unique_element result = new One_unique_element();
        System.out.println("Unique elements: " + result.singleNumber(nums));
    }
}
