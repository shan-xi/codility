package lessons;

public class EquiLeader {
    class Solution {
        // O(N)
        public int solution(int[] A) {

            if (A.length == 1) {
                return 0;
            }

            int value = A[0];
            int size = 0;
            for (int k : A) {
                if (size == 0) {
                    size++;
                    value = k;
                } else {
                    if (k == value) {
                        size++;
                    } else {
                        size--;
                    }
                }
            }

            int candidate = Integer.MIN_VALUE;
            int count = 0;
            if (size > 0) {
                candidate = value;
            }

            for (int j : A) {
                if (j == candidate) {
                    count++;
                }
            }

            if (count <= A.length / 2) {
                return 0;
            }

            int leader = candidate;
            int equiCount = 0;
            int leaderCount = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == leader) {
                    leaderCount++;
                }

                boolean isLeftHasLeader = leaderCount > ((i + 1) / 2);
                boolean isRightHasLeader = (count - leaderCount) > ((A.length - i - 1) / 2);

                if (isLeftHasLeader && isRightHasLeader) {
                    equiCount++;
                }
            }

            return equiCount;
        }
    }

    public static void main(String[] args) {
        Solution s = new EquiLeader().new Solution();
        int[] A = {4, 3, 4, 4, 4, 2};
        System.out.println(s.solution(A));
    }
}
