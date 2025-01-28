package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    private static int[] findNextGreaterElementMStack(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[i] > stack.peek()) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }

    private static int[] findNextGreaterElement(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    count++;
                    res[i] = count;
                    break;
                } else {
                    count++;
                }
                System.out.println("");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = findNextGreaterElementMStack(new int[]{6, 0 , 8, 1, 3});
        int[] res1 = findNextGreaterElement(new int[]{73,74,75,71,69,72,76,73});
        for(int i : res1) {
            System.out.print(i + " ");
        }

    }
}
