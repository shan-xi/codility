package lessons;

import java.util.*;

public class Brackets {
    class Solution {
        // O(N)
        public int solution(String S) {
            Map<Character, Character> p = new HashMap();
            p.put(')', '(');
            p.put(']', '[');
            p.put('}', '{');

            Stack<Character> stack = new Stack<>();
            char[] c = S.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                    stack.push(c[i]);
                }
                if (c[i] == ')' || c[i] == ']' || c[i] == '}') {
                    if (stack.isEmpty()) {
                        return 0;
                    }
                    if (p.get(c[i]) != stack.pop()) {
                        return 0;
                    }
                }
            }

            if (!stack.isEmpty()) {
                return 0;
            }

            return 1;
        }
    }

    public static void main(String[] args) {
        // "(", "{", "[", "]", "}" and/or ")"
        Solution s = new Brackets().new Solution();
        String str = "{[()()]}";
        System.out.println(s.solution(str));
        String str1 = "([)()]";
        System.out.println(s.solution(str1));
        String str2 = "";
        System.out.println(s.solution(str2));
        String str3 = "{[(1)(2)]}";
        System.out.println(s.solution(str3));
        String str4 = "12";
        System.out.println(s.solution(str4));
        String str5 = ")(";
        System.out.println(s.solution(str5));
        String str6 = "{{{{";
        System.out.println(s.solution(str6));
    }

}
