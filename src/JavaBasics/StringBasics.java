package JavaBasics;

public class StringBasics {
    public static void main(String[] args) {
        String str = "pramod";
        System.out.println("name is " + str);
        String str1 = "malayalam";
        StringBuilder str2 = new StringBuilder(str1);
        StringBuilder rStr2 = str2.reverse();
        if (str2.equals(rStr2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }


}
