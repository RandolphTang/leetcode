public class RestoretheArrayFromAdjacentPairs {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, List<Integer>> organize = new HashMap<>();

        for(int[] pairs: adjacentPairs) {
            int u = pairs[0];
            int v = pairs[1];
            organize.putIfAbsent(u, new ArrayList<>());
            organize.putIfAbsent(v, new ArrayList<>());

            organize.get(u).add(v);
            organize.get(v).add(u);
        }

        int[] ans = new int[adjacentPairs.length + 1];
        for(int num: organize.keySet()) {
            if (organize.get(num).size() == 1) {
                ans[0] = num;
                ans[1] = organize.get(num).get(0);
                break;
            }
        }

        for(int i = 2; i < ans.length; i++) {
            int tail = ans[i - 1];
            int prev = ans[i - 2];
            List<Integer> adjs = organize.get(tail);
            if (adjs.get(0) == prev) {
                ans[i] = adjs.get(1);
            } else {
                ans[i] = adjs.get(0);
            }
        }

        return ans;
    }
}
