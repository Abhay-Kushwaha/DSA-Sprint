import java.util.HashMap;
import java.util.Map;
public class Longest_Palindrome {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map=new HashMap<>();
        int c=0, center=0;
        for(String word:words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        for(String word:map.keySet()){
            int fq=map.get(word);
            if(fq==0) continue;
            String rev=new StringBuilder(word).reverse().toString();
            if(word.equals(rev)){
                c+=(fq/2)*4;
                if(fq%2==1) center=1;
            }
            else if(map.containsKey(rev)){
                int pairs=Math.min(fq, map.get(rev));
                c+=pairs*4;
                map.put(rev, 0);
            }
            map.put(word, 0);
        }
        if(center==1) c+=2;
        return c;
    }

    public static void main(String[] args) {
        Longest_Palindrome lp = new Longest_Palindrome();
        String[] words = { "ab", "ty", "yt", "lc", "cl", "ab"};
        System.out.println(lp.longestPalindrome(words)); 
    }
}