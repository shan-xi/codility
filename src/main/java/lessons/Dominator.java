package lessons;

import java.util.Arrays;
import java.util.Stack;

public class Dominator {
    class Solution {
        // O(N*log(N)) or O(N)
        public int solution(int[] A) {
            if (A.length == 1) {
                return 0;
            }
            int[] ca = A.clone();
            Arrays.sort(ca);
            Stack<Integer> stack = new Stack<>();
            Integer find = null;
            int total = A.length;
            int max = Integer.MIN_VALUE;
            for (int i : ca) {

                if (!stack.isEmpty()) {
                    if (stack.peek() != i) {
                        if (stack.size() > max && stack.size() > total / 2) {
                            max = stack.size();
                            find = stack.peek();
                        }
                        stack.clear();
                    }
                }

                stack.push(i);
            }
            if (find == null) {
                if (stack.size() > total / 2) {
                    find = stack.peek();
                }
            }

            if (find != null) {
                for (int i = 0; i < A.length; i++) {
                    if (A[i] == find) {
                        return i;
                    }
                }
            }

            return -1;
        }

    }

    public static void main(String[] args) {
        Solution s = new Dominator().new Solution();
//        int[] A = {4, 3, 3, 2, 3, -1, 3, 3};
//        System.out.println(s.solution(A));
//        int[] A1 = {2147483647};
//        System.out.println(s.solution(A1));
//        int[] A2 = {1, 1};
//        System.out.println(s.solution(A2));
//        int[] A3 = {2, 1};
//        System.out.println(s.solution(A3));
        int[] A4 = {4, 3, 4, 4, 4, 2};
        System.out.println(s.solution(A4));
    }
}
