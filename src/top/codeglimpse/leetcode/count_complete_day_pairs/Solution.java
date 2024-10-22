package top.codeglimpse.leetcode.count_complete_day_pairs;

public class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        int[] data = new int[24];
        for (int hour : hours) {
            ans += data[(24 - hour % 24) % 24];
            data[hour % 24]++;
        }
        return ans;
    }
}
