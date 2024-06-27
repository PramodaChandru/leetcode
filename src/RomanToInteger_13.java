import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger_13 {
    public static int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman number");
        String s = sc.next();
        int res = RomanToInteger_13.romanToInt(s);
        System.out.println("Result "+ res);
    }
}
