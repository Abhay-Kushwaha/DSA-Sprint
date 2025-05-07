// Fill a Special Grid
// You are given a non-negative integer n representing a 2n x 2n grid. You must fill the grid with integers from 0 to 22n - 1 to make it special. A grid is special if it satisfies all the following conditions:
// All numbers in the top-right quadrant are smaller than those in the bottom-right quadrant.
// All numbers in the bottom-right quadrant are smaller than those in the bottom-left quadrant.
// All numbers in the bottom-left quadrant are smaller than those in the top-left quadrant.
// Each of its quadrants is also a special grid.
// Return the special 2n x 2n grid.
// Note: Any 1x1 grid is special.

// Example 1:
// Input: n = 1
// Output: [[3,0],[2,1]]
// Explanation:
// The numbers in each quadrant are:
// Top-right: 0
// Bottom-right: 1
// Bottom-left: 2
// Top-left: 3
// Since 0 < 1 < 2 < 3, this satisfies the given constraints.

public class Special_Grid {
    public static void main(String[] args) {
        Special_Grid obj = new Special_Grid();
        int[][] result = obj.specialGrid(2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public int[][] specialGrid(int N) {
        int size = 1 << N;
        return fill(size, 0);
    }

    public int[][] merger(int[][] grid, int hf, int[][] tr, int[][] br, int[][] tl, int[][] bl) {
        for (int i = 0; i < hf; i++) {
            for (int j = 0; j < hf; j++) {
                grid[i][j + hf] = tr[i][j];
                grid[i + hf][j + hf] = br[i][j];
                grid[i + hf][j] = bl[i][j];
                grid[i][j] = tl[i][j];
            }
        }
        return grid;
    }

    public int[][] fill(int n, int st) {
        if (n == 1)
            return new int[][] { { st } };
        int hf = n / 2;
        int size = hf * hf;
        int[][] tr = fill(hf, st);
        int[][] br = fill(hf, st + size);
        int[][] bl = fill(hf, st + 2 * size);
        int[][] tl = fill(hf, st + 3 * size);

        int[][] grid = new int[n][n];

        merger(grid, hf, tr, br, tl, bl);
        return grid;
    }
}