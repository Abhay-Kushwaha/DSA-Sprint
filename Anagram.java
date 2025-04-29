import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s_Arr = s.toCharArray();
        char[] t_Arr = t.toCharArray();
        Arrays.sort(s_Arr);
        Arrays.sort(t_Arr);
        return Arrays.equals(s_Arr, t_Arr);
    }

    public static void main(String[] args) {
        Anagram checker = new Anagram();

        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println("Test 1: " + checker.isAnagram(s1, t1)); // true
        System.out.println("Test 2: " + checker.isAnagram(s2, t2)); // false
    }
}
