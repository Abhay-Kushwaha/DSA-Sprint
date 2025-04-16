class Toeplitz {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        int n = 4;
        int t = 0;
        int[][] arr = {
                { 4, 1, 5, 3 },
                { 8, 4, 1, 5 },
                { 3, 7, 4, 1 },
                { 9, 6, 8, 4 }
        };
        for (int i = 0; i < (n - 2); i++) {
            for (int j = 0; j < (n - 2); j++) {
                if (arr[i][j] == arr[i + 1][j + 1]) {
                    t = 1;
                    continue;
                } else {
                    // System.out.println("NOT Toeplitz");
                    t = 0;
                    break;
                }
            }
        }
        System.out.println((t == 1) ? "Toeplitz" : "NOT Toeplitz");
    }
}