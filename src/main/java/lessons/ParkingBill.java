public class ParkingBill {
    class Solution {
        public int solution(String E, String L) {
            String Earr[] = E.split(":");
            String Larr[] = L.split(":");
            int h = Integer.parseInt(Larr[0]) - Integer.parseInt(Earr[0]);
            int m = Integer.parseInt(Larr[1]) - Integer.parseInt(Earr[1]);
            int cost = 0;

            if (h == 0 && m > 0) {
                cost = 2 + 3;
            } else if (h > 0) {
                cost = 2 + 3;
                if (h - 1 > 0) {
                    cost += (h - 1) * 4;
                }
                if (m > 0) {
                    cost += 4;
                }
            }

            return cost;
        }
    }

    public static void main(String[] args) {
        ParkingBill.Solution s = new ParkingBill().new Solution();
        int r = s.solution("10:00", "13:21");
        System.out.println(r);
        int r2 = s.solution("09:42", "11:42");
        System.out.println(r2);
        int r3 = s.solution("09:42", "09:43");
        System.out.println(r3);

    }
}
