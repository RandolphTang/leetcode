package April.FindIfPathExistsinGraph;

public class Solution1 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int[] edge: edges){
            int node1 = edge[0];
            int node2 = edge[1];

            if(!map.containsKey(node1))map.put(node1, new ArrayList<>());
            if(!map.containsKey(node2))map.put(node2, new ArrayList<>());
            map.get(node1).add(node2);
            map.get(node2).add(node1);
        }

        int[] visited = new int[n];
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(source);
        visited[source] = 1;

        while(!pq.isEmpty()){
            int next = pq.poll();
            if(next == destination){
                return true;
            }
            visited[next] = 1;
            for(int eachNode: map.get(next)){
                if(visited[eachNode] == 0){
                    visited[eachNode] = 1;
                    pq.offer(eachNode);
                }
            }
        }

        return source == destination? true : false;
    }
}
