package unorganized;

public class RestoretheArrayFromAdjacentPairs {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, List<Integer>> record = new HashMap<>();

        //putIfAbsent
        // this hashmap method only do insertion,
        // unlike put method that does both update and insertion

        for(int[] pairs: adjacentPairs){
            int key = pairs[0];
            int value = pairs[1];

            record.putIfAbsent(key, new ArrayList<>());
            record.putIfAbsent(value, new ArrayList<>());

            record.get(key).add(value);
            record.get(value).add(key);
        }

        int[] ans = new int[adjacentPairs.length + 1];
        for(int num: record.keySet()){
            if(record.get(num).size() == 1){
                ans[0] = num;
                ans[1] = record.get(num).get(0);
                break;
            }
        }

        for(int i = 2; i < ans.length; i++){
            int first = ans[i - 2];
            int second = ans[i - 1];

            if(record.get(second).get(0) == first){
                ans[i] = record.get(second).get(1);
            } else {
                ans[i] = record.get(second).get(0);
            }

        }

        return ans;

    }
}
