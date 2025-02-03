package graph;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutes {
    public static int minReorder(int n, int[][] connections) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            al.add(new ArrayList<>());
        }

        for(int[] c : connections) {
            al.get(c[0]).add(c[1]);
            al.get(c[1]).add(-c[0]);
        }

        return dfs(al, new boolean[n], 0);
    }

    public static int dfs(List<List<Integer>> al, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        for(Integer to : al.get(from)) {
            if(!visited[Math.abs(to)]) {
                change += dfs(al, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
            }
        }

        return change;
    }

    public static void main(String[] args) {
        System.out.println(minReorder(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}));
    }
}
