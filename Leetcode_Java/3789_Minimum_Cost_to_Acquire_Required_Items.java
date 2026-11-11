class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int minNeed = Math.min(need1, need2);
        int maxNeed = Math.max(need1, need2);
        int remainingCost = (need1 > need2) ? cost1 : cost2;

        long c1 = (long) need1*cost1 + (long) need2*cost2;
        long c2 = (long) minNeed*costBoth + (long) (maxNeed - minNeed) * (long) Math.min(costBoth, remainingCost);
        long c3 = (long) maxNeed*costBoth;

        return Math.min(Math.min(c1, c2), c3);
    }
}
