package other;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    private static int equalPairs(int[][] grid) {
        System.out.println(grid.length);


        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length;j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        for(int j = 0; j < grid.length; j++) {
            for(int i = 0; i < grid.length;i++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }


        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for(int j = 0; j < n; j++) {
                row.append(grid[i][j]);
            }
            String s = row.toString();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(int j = 0; j < n; j++) {
            StringBuilder column = new StringBuilder();
            for(int i = 0; i < n; i++) {
                column.append(grid[i][j]);
            }
            String s = column.toString();
            if(map.containsKey(s)) {
                count += map.get(s);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
    }
}
