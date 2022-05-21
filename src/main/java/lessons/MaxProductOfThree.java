import java.util.Arrays;

public class MaxProductOfThree {
    class Solution {
        // O(N * log(N))
        public int solution(int[] A) {
            Arrays.sort(A);
            if (A[A.length - 1] < 0) {

            } else {
                if (A[0] < 0 && A[1] < 0) {
                    if (A[0] * A[1] * A[A.length - 1] >= A[A.length - 1] * A[A.length - 2] * A[A.length - 3]) {
                        return A[0] * A[1] * A[A.length - 1];
                    }
                }
            }
            return A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        }
    }

    public static void main(String[] args) {
        MaxProductOfThree.Solution s = new MaxProductOfThree().new Solution();
        int[] A = {-3, 1, 2, -2, 5, 6};
        System.out.println(s.solution(A));
        int[] A2 = {-5, 5, -5, 4};
        System.out.println(s.solution(A2));
        int[] A3 = {-10, -9, -8, -7, 1, 1, 30};
        System.out.println(s.solution(A3));
        int[] A4 = {-5, -6, -4, -7, -10};
        System.out.println(s.solution(A4));
        int[] A5 = {4, 7, 3, 2, 1, -3, -5};
        System.out.println(s.solution(A5));
    }
}