// There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
// After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
// When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
// For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.
// You are given a string dominoes representing the initial state where:

// dominoes[i] = 'L', if the ith domino has been pushed to the left,
// dominoes[i] = 'R', if the ith domino has been pushed to the right, and
// dominoes[i] = '.', if the ith domino has not been pushed.
// Return a string representing the final state.

public class Push_Domino {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        StringBuilder result = new StringBuilder();
        int[] forces = new int[n];
        int force = 0;
        // LR
        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R') {
                force = n;
            } else if (dominoes.charAt(i) == 'L') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] += force;
        }
        // RL
        force = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                force = n;
            } else if (dominoes.charAt(i) == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            forces[i] -= force;
        }
        // Final
        for (int f : forces) {
            if (f == 0)
                result.append('.');
            else if (f > 0)
                result.append('R');
            else
                result.append('L');
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String dominoes = ".L.R...LR..L..";
        // String dominoes = "RR.L";
        Push_Domino obj = new Push_Domino();
        System.out.println("Final State: " + dominoes);
        System.out.println("Initial State: " + obj.pushDominoes(dominoes));
    }
}
