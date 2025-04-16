// import java.util.Scanner;
import java.util.Arrays;

public class Duplicate {
    public int[] DUP(int arr[], int n) {
        Arrays.sort(arr);
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        int[] newArray = new int[j];
        for (int i = 0; i < j; i++) {
            newArray[i] = temp[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 2, 2, 2, 4 };
        int n = arr.length;

        Duplicate d = new Duplicate();
        int[] new_Arr = d.DUP(arr, n);

        System.out.println("New Array: ");
        for (int i = 0; i < new_Arr.length; i++) {
            System.out.print(new_Arr[i] + " ");
        }
    }
}
