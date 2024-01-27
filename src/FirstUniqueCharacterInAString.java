import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacterInAString {
        public static int firstUniqChar(String s) {
            int index = -1;
            char c = ' ';
            Map<Character, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < s.length(); i++) {
                if(map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }

            System.out.println(map);
            for(Map.Entry<Character, Integer> m : map.entrySet()) {
                if(m.getValue() == 1) {
                    c = m.getKey();
                    break;
                }
            }

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) {
                    index = i;
                }
            }
            return index;
        }

    public static int firstUniqCharNew(String str) {
            for(int i = 0; i < str.length(); i++) {
                System.out.println("----"+i);
                for (int j = 0; j < str.length(); j++) {
                    if(i != j && (str.charAt(i) != str.charAt(j)) ) {
                        //System.out.println("--->"i);
                        return i;
                    }
                }

            }
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find the first unique character");
        String str = sc.nextLine();
        int index = firstUniqCharNew(str);
        System.out.println(index);
    }
}
