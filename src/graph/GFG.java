package graph;

public class GFG {

    private static void graphRepr(int n, int m) {
        int[][] adj = new int[n+1][m+1];
        adj[1][2] = 1;
        adj[2][1] = 1;

        adj[2][3] = 1;
        adj[3][2] = 1;

        adj[1][3] = 1;
        adj[3][1] = 1;

        for(int i = 1; i < adj.length; i++) {
            for(int j = 1; j < adj.length; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        graphRepr(3, 3);
    }
}
