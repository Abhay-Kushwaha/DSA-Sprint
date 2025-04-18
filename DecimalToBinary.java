import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = sc.nextInt();
        // int num = 13;
        int ans = 0;
        int power = 1;
        while (num > 0) {
            int rem = num % 2;
            num /= 2;
            ans += (rem * power);
            power *= 10;
        }
        System.out.println(ans);
        sc.close();
    }
}