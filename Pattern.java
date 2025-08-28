public class Pattern {
    // 1
    // 3 2
    // 4 5 6
    // 10 9 8 7
    // 11 12 13 14 15
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int temp = count + i - 1; // 10 9 8 7
                for (int j = 1; j <= i; j++) {
                    System.out.print(temp + " ");
                    temp--;
                    count++;
                }
            } 
            else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}