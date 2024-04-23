package AprilWeek2.MinimumHeightTrees;
//faster
public class Solution2 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 0 || edges.length == 0) return new ArrayList<>(Arrays.asList(0));

        ArrayList<Integer>[] adj = new ArrayList[n];
        int[] indegree = new int[n];

        for(int i=0; i<n; i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] e: edges){
            int v = e[0];
            int u = e[1];

            adj[v].add(u);
            adj[u].add(v);
            indegree[u]++;
            indegree[v]++;
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<n; ++i){
            if(indegree[i] == 1){
                queue.add(i);
            }
        }

        while(n > 2) {
            int size = queue.size();
            n -= size;

            while(size-- > 0){
                int rem = queue.remove();

                for(int i: adj[rem]){
                    indegree[i]--;
                    if(indegree[i] == 1){
                        queue.add(i);
                    }
                }

            }

        }

        List<Integer> res = new ArrayList<>();
        while(queue.size() > 0){
            res.add(queue.poll());
        }

        return res;
    }
}
