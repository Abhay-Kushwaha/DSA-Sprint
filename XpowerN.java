public class XpowerN {
    public double myPow(double x, int n) {
        // corner cases
        if (x == 0)
            return 0.0;
        if (x == 1 || n == 0 || (x == -1 && n % 2 == 0))
            return 1.0;
        if (x == -1 && n % 2 != 0)
            return -1.0;

        long bin = n;
        if (n < 0) {
            x = 1 / x;
            bin = -bin;
        }
        double ans = 1;

        // Binary Conversion
        while (bin > 0) {
            if (bin % 2 == 1) {
                ans *= x;
            }
            x *= x;
            bin /= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        XpowerN obj = new XpowerN();
        System.out.println(obj.myPow(5, 3));
        System.out.println(obj.myPow(0, 3));
        System.out.println(obj.myPow(1, 3));
        System.out.println(obj.myPow(-1, 3));
        System.out.println(obj.myPow(5, -1));
    }
}
