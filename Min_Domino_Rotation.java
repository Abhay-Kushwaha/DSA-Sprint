public class Min_Domino_Rotation{
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int target = tops[0];
        int rot_tops = 0;
        int rot_bottoms = 0;
        boolean valid = true;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                valid = false;
                break;
            }
            if (tops[i] != target)
                rot_tops++;
            if (bottoms[i] != target)
                rot_bottoms++;
        }
        if (valid)
            return Math.min(rot_tops, rot_bottoms);
        if (tops[0] != bottoms[0]) {
            target = bottoms[0];
            rot_tops = 0;
            rot_bottoms = 0;
            valid = true;
            for (int i = 0; i < tops.length; i++) {
                if (tops[i] != target && bottoms[i] != target) {
                    valid = false;
                    break;
                }
                if (tops[i] != target)
                    rot_tops++;
                if (bottoms[i] != target)
                    rot_bottoms++;
            }
            if (valid)
                return Math.min(rot_tops, rot_bottoms);
        }
        return -1;
    }
    public static void main(String[] args) {
        int tops[] = { 2, 1, 2, 4, 2};
        int bottoms[] = { 5, 2, 6, 2, 3 };
        // int tops[] = { 3, 5, 1, 2, 3};
        // int bottoms[] = { 3, 6, 3, 3, 4 };
        Min_Domino_Rotation obj = new Min_Domino_Rotation();
        System.out.println("Minimum Rotation Required: "+obj.minDominoRotations(tops, bottoms));
    }
}