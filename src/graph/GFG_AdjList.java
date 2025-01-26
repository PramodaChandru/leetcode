package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GFG_AdjList {

    private static void adjList(int n) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(1);
        adj.get(1).add(3);

//        for(int i = 1; i <= n; i++) {
//            for(int j = 0; j < adj.get(i).size(); j++) {
//                System.out.print(adj.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }

        bfs(adj, 1);


    }

    private static void bfs(ArrayList<ArrayList<Integer>> adjList, int s) {
        boolean[] isVisited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        isVisited[s] = true;
        queue.offer(s);
        while(!queue.isEmpty()) {
            int u = queue.poll();
            for(int v : adjList.get(u)) {
                if(!isVisited[v]) {
                    isVisited[v] = true;
                    queue.offer(v);
                }
            }
        }

        for(int i = 1; i < isVisited.length; i++) {
            System.out.println(isVisited[i] + " ");
        }
    }

    public static void main(String[] args) {
        adjList(3);
    }
}
