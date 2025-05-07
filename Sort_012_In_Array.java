public class Sort_012_In_Array {

    // Dutch National Flag Algorithm

    public int[] sort012(int[] arr) {
        int mid = 0, low = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // arr[low] = arr[mid] + arr[low] - (arr[mid] = arr[low]);
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // arr[mid] = arr[high] + arr[mid] - (arr[mid] = arr[high]);
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 1, 0, 1, 0, 2, 1, 0, 0, 1 };
        Sort_012_In_Array obj = new Sort_012_In_Array();
        // print array
        for (int x : arr) {
            System.out.print(x + " ");
        }
        obj.sort012(arr);
        System.out.println();
        // print array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
