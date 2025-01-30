package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Senate {
    private static String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = senate.length();
        for(int i = 0; i < n; i++) {
            if(senate.charAt(i) == 'R') {
                rad.offer(i);
            } else {
                dir.offer(i);
            }
        }

        while(!rad.isEmpty() && !dir.isEmpty()) {
            if(rad.peek() < dir.peek()) {
                rad.offer(n++);
            } else {
                dir.offer(n++);
            }
            rad.poll();
            dir.poll();
        }

        return rad.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }
}
