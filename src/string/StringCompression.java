package string;

/**
 Given:
 An array of characters chars

 Approach:
 1. Will loop through the char array
 2. Initialize i with start index and j with i + 1
 3. compare chars[i] and chars[j] if equal increment j and keep the counter, do this until chars[i] != chars[j] or j reaches end of the chars array
 4. if not equal, assign chars[k] == chars[j - 1], k + 1 = count, k = k + 1, i = j and j = i + 1
 5. if(count is > 10 we need to perform )
 */
public class StringCompression {
    private static int compress(char[] chars) {
        int spIndex = 0;
        for(int i = 0; i < chars.length;) {
            final char letter = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }

            chars[spIndex++] = letter;

            if(count > 1) {
                for(final char c : String.valueOf(count).toCharArray()) {
                    chars[spIndex++] = c;
                }
            }
        }
        return spIndex;
    }

    public static void main(String[] args) {
        char[] cArr = new char[]{'a', 'a', 'b', 'b'};
        char[] cArrAns = new char[]{'a', 2, 'b', '2'};
        int n = compress(cArr);
        for(int i = 0; i < n; i++) {
            System.out.println(cArrAns[i]);
        }
    }
}
