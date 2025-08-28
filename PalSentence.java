import java.util.Scanner;
// palindrome sentence after removing spaces and punctuations
// sentence- A man, a plan, a canal: Panama
// sentence- Race a car
public class PalSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        String N = "";
        for (char x : s.toCharArray()) {
            if ((x>='a' && x<='z' || x>='A' && x<='Z' || x >= '0' && x <= '9') && x!=' ') {
                N = N+(Character.toLowerCase(x));
            }
        }
        String pal = "";
        for (int i = N.length()-1; i >= 0; i--) {
            pal = pal + N.charAt(i);
        }
        if (N.equals(pal)) {
            System.out.println(N +" is a Palindrome");
        } 
        else {
            System.out.println(N+" is Not a palindrome");
        }
        sc.close();
    }
}