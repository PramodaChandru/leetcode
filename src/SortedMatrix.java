public class SortedMatrix {
    private int[][] matrix;

    public void createSortedMatrix(int n) {
        int[] values = {10,20,30,40,15,25,35,45,27,29,37,48,32,33,39,51};
        int k = 0;
        matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = values[k];
                k++;
            }
        }
    }

    public void printSortedMatrix(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void searchValue(int value, int n) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >=0) {
            if (matrix[i][j] == value) {
                System.out.println("x found at - " + i + "," + j);
                return;
            }
            if (matrix[i][j] > value) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not found");
    }


    public static void main(String[] args) {
        SortedMatrix sm = new SortedMatrix();
        sm.createSortedMatrix(4);
        sm.printSortedMatrix(4);
        sm.searchValue(32, 4);
    }
}
