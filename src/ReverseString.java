import java.util.Scanner;

public class ReverseString {
    public void reverseString(char[] s) {
        char temp = ' ';
        int j = s.length - 1;
        for (int i = 0; i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        rs.reverseString(s);
        for (char c : s) {
            System.out.print(c+ " ");
        }
    }
}
