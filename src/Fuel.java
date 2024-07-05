import java.util.PriorityQueue;

class Fuel {
    public int solution(int[] A, int X, int Y, int Z) {
        int[] fuel = {X, Y, Z};
        PriorityQueue<int[]> priQue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < 3; i++) {
            priQue.add(new int[]{0, i});
        }
        int maxWaitTime = 0;
        for (int demand : A) {
            boolean refueled = false;
            PriorityQueue<int[]> tempPQ = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            while (!priQue.isEmpty()) {
                int[] dispenser = priQue.poll();
                int availableTime = dispenser[0];
                int index = dispenser[1];
                if (fuel[index] >= demand) {
                    maxWaitTime = Math.max(maxWaitTime, availableTime);
                    fuel[index] -= demand;
                    priQue.add(new int[]{availableTime + demand, index});
                    refueled = true;
                    break;
                } else {
                    tempPQ.add(dispenser);
                }
            }

            while (!tempPQ.isEmpty()) {
                priQue.add(tempPQ.poll());
            }

            if (!refueled) {
                return -1;
            }
        }
        return maxWaitTime;
    }

    public static void main(String[] args) {
        Fuel solution = new Fuel();

//        int[] A1 = {2, 8, 4, 3, 2};
//        int X1 = 7, Y1 = 11, Z1 = 3;
//        System.out.println(solution.solution(A1, X1, Y1, Z1));
//
//        int[] A2 = {5, 2, };
//        int X2 = 6, Y2 = 3, Z2 = 3;
//        System.out.println(solution.solution(A2, X2, Y2, Z2));
//
//        int[] A3 = {3, 3, 3};
//        int X3 = 3, Y3 = 3, Z3 = 3;
//        System.out.println(solution.solution(A3, X3, Y3, Z3));

        int[] A1 = {10, 15, 12};
        int X1 = 20, Y1 = 30, Z1 = 25;
        System.out.println(solution.solution(A1, X1, Y1, Z1));  // Expected output: 8

        // Test case 2: Waiting Required
        int[] A2 = {5, 5, 5, 5};
        int X2 = 10, Y2 = 10, Z2 = 10;
        System.out.println(solution.solution(A2, X2, Y2, Z2));  // Expected output: 10

        // Test case 3: Insufficient Fuel
        int[] A3 = {10, 10, 10};
        int X3 = 5, Y3 = 5, Z3 = 5;
        System.out.println(solution.solution(A3, X3, Y3, Z3));  // Expected output: -1

        // Test case 4: Single Car
        int[] A4 = {5};
        int X4 = 4, Y4 = 0, Z4 = 3;
        System.out.println(solution.solution(A4, X4, Y4, Z4));  // Expected output: -1

        // Test case 5: Equal Fuel Dispensers
        int[] A5 = {3, 3, 3};
        int X5 = 3, Y5 = 3, Z5 = 3;
        System.out.println(solution.solution(A5, X5, Y5, Z5));  // Expected output: 3

        // Test case 6: High Fuel Demand
        int[] A6 = {15, 5, 5, 5, 5};
        int X6 = 20, Y6 = 20, Z6 = 20;
        System.out.println(solution.solution(A6, X6, Y6, Z6));  // Expected output: 5

        // Test case 7: Edge Case - Minimum constraints
        int[] A7 = {1};
        int X7 = 1, Y7 = 0, Z7 = 0;
        System.out.println(solution.solution(A7, X7, Y7, Z7));  // Expected output: 0

        // Test case 8: Edge Case - Maximum constraints
        int[] A8 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            A8[i] = 1000000000;
        }
        int X8 = 1000000000, Y8 = 1000000000, Z8 = 1000000000;
        // Expected output depends on the maximum waiting time calculation
        System.out.println(solution.solution(A8, X8, Y8, Z8));
    }
}
