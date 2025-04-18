import java.util.*;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number: ");
        int bin = sc.nextInt();
        // int bin = 1011;
        int dec = 0;
        int power = 0;
        while (bin > 0) {
            int rem = bin % 10;
            dec += rem * (int) Math.pow(2, power);
            power++;
            bin /= 10;
        }
        System.err.println(dec);
        sc.close();
    }
}
