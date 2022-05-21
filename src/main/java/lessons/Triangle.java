import java.util.Arrays;

public class Triangle {
    class Solution {
        // O(N*log(N))
        public int solution(int[] A) {
            Arrays.sort(A);
            for (int i = 0; i <= A.length - 3; i++) {
                if ((A[i + 1] > A[i + 2] - A[i])
                        && (A[i + 2] > A[i + 1] - A[i])
                        && (A[i + 1] > A[i] - A[i + 2])) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new Triangle().new Solution();
        int[] A = {10, 2, 5, 1, 8, 20};
        System.out.println(s.solution(A));
        int[] A1 = {10, 50, 5, 1};
        System.out.println(s.solution(A1));
        int[] A2 = {5, 3, 3};
        System.out.println(s.solution(A2));
        int[] A3 = {1, 1, 2, 3, 5};
        System.out.println(s.solution(A3));
        int[] A4 = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        System.out.println(s.solution(A4));
    }
}
