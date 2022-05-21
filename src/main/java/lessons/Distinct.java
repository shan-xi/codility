import java.util.Arrays;

public class Distinct {
    class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            int last = Integer.MAX_VALUE;
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (i == 0) {
                    last = A[i];
                    count += 1;
                } else {
                    if (A[i] != last) {
                        count += 1;
                        last = A[i];
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Distinct.Solution s = new Distinct().new Solution();
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println(s.solution(A));
        int[] A2 = {2};
        System.out.println(s.solution(A2));
        int[] A3 = {2, 2};
        System.out.println(s.solution(A3));
    }
}
