public class KMPAlgorithm {

    // Step 1: Build LPS array
    public static int[] buildLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];

        int len = 0; // length of previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // fallback
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Step 2: KMP Search
    public static void search(String text, String pattern) {
        int[] lps = buildLPS(pattern);

        int i = 0; // text pointer
        int j = 0; // pattern pointer

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                System.out.println("Pattern found at index: " + (i - j));
                j = lps[j - 1]; // continue searching
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; // jump using LPS
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        search(text, pattern);
    }
}
public class KMP {
    
}
