package lessons;

import java.util.Stack;

public class Fish {
    class Solution {
        // O(N)
        public int solution(int[] A, int[] B) {
            Stack<Integer> stackA = new Stack<>();
            Stack<Integer> stackB = new Stack<>();
            for (int i = 0; i < A.length; i++) {
                if (i == 0) {
                    stackA.push(A[i]);
                    stackB.push(B[i]);
                } else {
                    boolean is_alive = true;
                    while (!stackA.isEmpty()) {
                        if (stackB.peek() == 1 && B[i] == 0) {

                            if (stackA.peek() < A[i]) {
                                stackA.pop();
                                stackB.pop();
                            } else {
                                is_alive = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (is_alive) {
                        stackA.push(A[i]);
                        stackB.push(B[i]);
                    }
                }
            }
            return stackA.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new Fish().new Solution();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        System.out.println(s.solution(A, B));
        int[] A1 = {4, 3, 2, 1, 5};
        int[] B1 = {1, 0, 0, 0, 0};
        System.out.println(s.solution(A1, B1));
        int[] A2 = {4, 3, 2, 1, 5};
        int[] B2 = {0, 0, 0, 0, 1};
        System.out.println(s.solution(A2, B2));
        int[] A3 = {4, 3, 2, 1, 5};
        int[] B3 = {0, 0, 0, 1, 0};
        System.out.println(s.solution(A3, B3));
        int[] A4 = {6, 5, 4, 3, 2, 1};
        int[] B4 = {1, 0, 0, 0, 0, 0};
        System.out.println(s.solution(A4, B4));
        int[] A5 = {1, 2, 3, 4, 5, 6};
        int[] B5 = {1, 1, 1, 1, 1, 0};
        System.out.println(s.solution(A5, B5));
    }

}
