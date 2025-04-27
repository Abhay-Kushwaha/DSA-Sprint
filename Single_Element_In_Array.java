public class Single_Element_In_Array {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        if (nums.length == 1)
            return nums[0];
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (mid == 0 && nums[0] != nums[1])
                return nums[mid];
            if (mid == nums.length - 1 && nums[nums.length - 1] != nums[nums.length - 2])
                return nums[mid];
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Single_Element_In_Array obj = new Single_Element_In_Array();
        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        System.out.println(obj.singleNonDuplicate(nums));
    }
}
