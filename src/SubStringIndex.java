public class SubStringIndex {
    public static int strStr(String haystack, String needle) {
            boolean flag = false;
            for (int i = 0; i < haystack.length(); i++) {
                if(haystack.charAt(i) == needle.charAt(0)) {
                    for (int j = 0; j < needle.length(); j++) {
                        if(haystack.charAt(j + i) != needle.charAt(j)) {
                            flag = false;
                            break;
                        } else {
                            flag = true;
                        }
                    }
                    if (flag) {
                        return i;
                    }
                }
            }
            return -1;
    }

    public static int strStr2(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && (needle.length() + i) <= haystack.length()) {
                String str1 = haystack.substring(i, needle.length() + i);
                if (str1.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr2("aasad", "d"));
    }
}
