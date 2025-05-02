public class Allocate_min_pg {
    static boolean isValid(int[] arr, int n, int k, int maxAllowedPG) {
        int stu = 1;
        int pgs = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxAllowedPG)
                return false;

            if (pgs + arr[i] <= maxAllowedPG) {
                pgs += arr[i];
            } else {
                stu++;
                pgs = arr[i];
            }
        }
        return stu > k ? false : true;
    }

    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n < k)
            return -1;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int ans = -1;
        int st = 0;
        int end = sum;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isValid(arr, n, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] books = { 12, 34, 67, 90 }; // Pages in each book
        int students = 2; // Number of students

        int result = Allocate_min_pg.findPages(books, students);
        System.out.println("Minimum of the maximum pages assigned: " + result);
    }
}
