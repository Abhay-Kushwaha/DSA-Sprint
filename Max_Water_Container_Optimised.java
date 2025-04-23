public class Max_Water_Container_Optimised {
    public int maxWaterContainer(int[] heights) {
        
        // Two Pointer Approach
        int left = 0, right = heights.length - 1, maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(heights[left], heights[right]) * (right - left));
            if (heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Max_Water_Container_Optimised obj = new Max_Water_Container_Optimised();
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int maxArea = obj.maxWaterContainer(heights);
        System.out.println("Maximum water container area: " + maxArea);
    }
}
