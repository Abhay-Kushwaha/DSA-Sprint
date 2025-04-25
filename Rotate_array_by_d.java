import java.util.Arrays;

public class Rotate_array_by_d {
    public void rotate(int[] nums, int d) {
        int i = 0;
        int j = d - 1;
        part_rotate(nums, i, j);
        i = d;
        j = nums.length-1;
        part_rotate(nums, i, j);
        i = 0;
        j = nums.length-1;
        part_rotate(nums, i, j);
    }

    public void part_rotate(int[] sub, int i, int j){
        int t = 0;
        while (i < j) {
            t = sub[i];
            sub[i] = sub[j];
            sub[j] = t;
            t = 0;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        Rotate_array_by_d obj = new Rotate_array_by_d();
        obj.rotate(arr, d);
        System.out.println("Rotated Array: "+ Arrays.toString(arr));
    }
}
