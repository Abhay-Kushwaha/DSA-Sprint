import java.util.Scanner;

class flipkart_petrol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int n = sc.nextInt();
        int n = 4;
        // int[][] arr = {{4,6},{6,5},{7,3},{4,5}};
        int[][] arr = {{1,3},{3,2},{5,10},{9,10}};
        int New[] = new int[n];
        for (int i = 0; i < n; i++) {
            New[i] = arr[i][0] - arr[i][1];
        }

        // print
        for (int j = 0; j < n; j++) {
            System.out.print(New[j]+" ");
        }
        sc.close();
    }
}