package lessons;

import java.util.Stack;

public class Nesting {
    class Solution {
        // O(N)
        public int solution(String S) {
            Stack<Character> stack = new Stack<>();
            char[] c = S.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(') {
                    stack.push(c[i]);
                } else if (c[i] == ')') {
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '(') {
                            stack.pop();
                        }
                    } else {
                        stack.push(c[i]);
                    }
                }
            }
            if (stack.size() > 0)
                return 0;
            else
                return 1;
        }
    }


    public static void main(String[] args) {
        Solution s = new Nesting().new Solution();
        String S = "";
        System.out.println(s.solution(S));
        String S1 = "(()(())())";
        System.out.println(s.solution(S1));
        String S2 = "())";
        System.out.println(s.solution(S2));
        String S3 = "(A)";
        System.out.println(s.solution(S3));
        String S4 = "A";
        System.out.println(s.solution(S4));
        String S5 = "((((((((";
        System.out.println(s.solution(S5));
        String S6 = "))))))))";
        System.out.println(s.solution(S6));
    }
}
