public class Max_Water_Container_Brute {
    public int maxWaterContainer(int[] height) {
        int n = height.length;
        int max_water = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int curr_area = w * h;
                max_water = Math.max(curr_area, max_water);
            }
        }
        return max_water;
    }

    public static void main(String[] args) {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Max_Water_Container_Brute obj = new Max_Water_Container_Brute();
        int maxArea = obj.maxWaterContainer(heights);
        System.out.println("Maximum water that can be contained: " + maxArea);
    }
}
