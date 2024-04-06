package JavaBasics;

import java.util.*;

public class CharCount {

    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("Entered string is "+str);

        char[] carr = str.toCharArray();

        for(int i = 0; i < carr.length; i++) {
            if(map.containsKey(carr[i])) {
                map.put(carr[i], (map.get(carr[i])) + 1);
            } else {
                map.put(carr[i], 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<Character> set = new LinkedHashSet<>();
        for(char c : carr) {
            set.add(c);
        }

        for(char c : set) {
            System.out.println(c);
        }
    }
}