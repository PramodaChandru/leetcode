import java.util.ArrayDeque;
import java.util.Queue;

class Cell {
    int row, col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class MonsterGame {
    public static int maximizeMinimumDistance(char[][] grid, int startRow, int startCol, int endRow, int endCol) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<Cell> queue = new ArrayDeque<>();
        queue.add(new Cell(startRow, startCol));
        dist[startRow][startCol] = 0;

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newRow = cell.row + dr[i];
                int newCol = cell.col + dc[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] != 'X' && dist[newRow][newCol] == Integer.MAX_VALUE) {
                    dist[newRow][newCol] = Math.min(dist[newRow][newCol], dist[cell.row][cell.col] + 1);
                    queue.add(new Cell(newRow, newCol));
                }
            }
        }

        return dist[endRow][endCol];
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'S', 'E', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'}
        };

        int n = grid.length;
        int m = grid[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = 0;
        int endCol = 1;

        int maxMinDistance = maximizeMinimumDistance(grid, startRow, startCol, endRow, endCol);
        System.out.println("Maximized Minimum Distance: " + maxMinDistance);
    }
}