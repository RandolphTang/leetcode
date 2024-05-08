package May.RelativeRanks;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        String[] ranks = new String[n];

        for (int i = 0; i < n; i++) {
            int rank = Arrays.binarySearch(sortedScore, score[i]); // binary search method is divide and conquer, so
            //give a number, and a array, find the index of the array
            if (rank == n - 1) {
                ranks[i] = "Gold Medal";
            } else if (rank == n - 2) {
                ranks[i] = "Silver Medal";
            } else if (rank == n - 3) {
                ranks[i] = "Bronze Medal";
            } else {
                ranks[i] = String.valueOf(n - rank);
            }
        }

        return ranks;
    }
}
