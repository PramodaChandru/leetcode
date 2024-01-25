import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nRows =  sc.nextInt();
        PascalTraingle pt = new PascalTraingle();
        System.out.println(pt.generate(nRows));
    }
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> pTraingle = new ArrayList<>();
            if (numRows == 0) return pTraingle;
            List<Integer> first_row = new ArrayList<>();
            first_row.add(1);
            pTraingle.add(first_row);
       for (int i = 1; i < numRows; i++) {
                List<Integer> prev_row = pTraingle.get(i-1);
                List<Integer> cur_row = new ArrayList<>();
                cur_row.add(1);
                for (int j = 1; j<i ; j++) {
                    cur_row.add(prev_row.get(j-1) + prev_row.get(j));
                }
                cur_row.add(1);
                pTraingle.add(cur_row);
            }
            return pTraingle;
        }

}
