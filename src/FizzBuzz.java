import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                list.add("FizzBuzz");
            } else if(i%3 == 0) {
                list.add("Fizz");
            } else if(i%5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate list of strings");
        int num = sc.nextInt();
        System.out.println(fb.fizzBuzz(num));
    }
}