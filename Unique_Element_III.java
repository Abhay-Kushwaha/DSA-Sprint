public class Unique_Element_III {
    public int unique(int[] arr) {
        int o = 0;
        int t = 0;
        for (int i : arr) {
            o = (o ^ i) & ~t;
            t = (t ^ i) & ~o;
        }
        return o;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 34, 34, 1, 2, 34, 2, 1 };
        Unique_Element_III result = new Unique_Element_III();
        System.out.println("Unique elements: " + result.unique(nums));
    }
}
