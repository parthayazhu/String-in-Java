import java.util.Arrays;

class Anagram {
    public static boolean isAnagram(String a, String b) {
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        return Arrays.equals(c, d);
    }
}