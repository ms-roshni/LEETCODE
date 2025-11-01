public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int empties = 0;
        int full = numBottles;

        while (full > 0) {
            // Drink all current full bottles
            totalDrank += full;
            empties += full;

            // Exchange empties for new full bottles
            full = empties / numExchange;
            // remaining empties after exchange
            empties = empties % numExchange;
        }

        return totalDrank;
    }
}
