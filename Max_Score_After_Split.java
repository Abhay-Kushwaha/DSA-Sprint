public class Max_Score_After_Split {
    public int maxScore(String s) {
        int total_1 = 0;
        for (char a : s.toCharArray()) {
            if (a == '1')
                total_1++;
        }
        int zeros = 0;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
                // max=Math.max(max,zeros+total_1);
            } else {
                total_1--;
                // max=Math.max(max,zeros+total_1);
            }
            max = Math.max(max, zeros + total_1);
        }
        return max;
    }

    public static void main(String[] args) {
        Max_Score_After_Split solution = new Max_Score_After_Split();
        String s = "011101";
        System.out.println("Max score after split: " + solution.maxScore(s));
    }
}
