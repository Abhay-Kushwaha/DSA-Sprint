import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Largest_Color_Directed_Graph {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length(), res = 0, vis = 0;
        int[][] fq = new int[n][26];
        int[] dg = new int[n];
        List<List<Integer>> gph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            gph.add(new ArrayList<>());
        for (int[] e : edges) {
            gph.get(e[0]).add(e[1]);
            dg[e[1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (dg[i] == 0)
                q.offer(i);
        while (!q.isEmpty()) {
            int u = q.poll(), c = colors.charAt(u) - 'a';
            res = Math.max(res, ++fq[u][c]);
            vis++;
            for (int v : gph.get(u)) {
                for (int i = 0; i < 26; i++)
                    fq[v][i] = Math.max(fq[v][i], fq[u][i]);
                if (--dg[v] == 0)
                    q.offer(v);
            }
        }
        return vis == n ? res : -1;
    }
    public static void main(String[] args) {
        Largest_Color_Directed_Graph solution = new Largest_Color_Directed_Graph();
        String colors = "abaca";
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}, {3, 4}};
        int result = solution.largestPathValue(colors, edges);
        System.out.println(result);
    }
}
