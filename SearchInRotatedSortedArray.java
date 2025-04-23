public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[st] <= nums[mid]) {
                // left sorted
                if (nums[st] <= target && target <= nums[mid]) {
                    // search left
                    end = mid - 1;
                } else {
                    // search right
                    st = mid + 1;
                }

            } else {
                // right sorted
                if (nums[mid] <= target && target <= nums[end]) {
                    // search left
                    st = mid + 1;
                } else {
                    // search right
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        obj.search(arr, 0);
        System.out.println("Index of target 0: " + obj.search(arr, 0));
    }
}