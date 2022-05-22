package lessons;

import java.util.Stack;

public class StoneWall {
    class Solution {
        // O(N)
        public int solution(int[] H) {

            // main idea: need to use "stack" to check when we need a new block
            Stack<Integer> st = new Stack<>();
            int numBlock = 0;

            // note: H[i] is the ith height of the wall
            for (int j : H) {

                // step 1: "stack is not empty" AND "from high to low"
                // then, "pop" (it is the key point, be careful)
                while (!st.isEmpty() && st.peek() > j) {
                    st.pop();
                }
                // step 2: if the stack is empty
                if (st.isEmpty()) {
                    numBlock++;  // add a block
                    st.push(j);  // push the height
                }
                // step 3: from low to high
                else if (st.peek() < j) {
                    numBlock++; // add a block
                    st.push(j); // push the height
                }
            }

            return numBlock;
        }
    }

    public static void main(String[] args) {
        Solution s = new StoneWall().new Solution();
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(s.solution(H));
    }
}
