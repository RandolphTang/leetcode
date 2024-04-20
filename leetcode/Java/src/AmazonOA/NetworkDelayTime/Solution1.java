package AmazonOA.NetworkDelayTime;

public class Solution1 {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<Pair<Integer, Integer>>[] graphs = new List[n];

        for(int i = 0; i < n; i++){
            graphs[i] = new ArrayList<>();
        }

        for(int[] time: times){
            int startNode = time[0] -1;
            int endNode = time[1] -1;
            int timeCost = time[2];
            graphs[startNode].add(new Pair<>(endNode, timeCost));
        }

        return dijkstra(graphs, k - 1);

    }

    public int dijkstra(List<Pair<Integer, Integer>>[] graphs, int k) {

        int[] cumulativeDistance = new int[graphs.length];
        Arrays.fill(cumulativeDistance, Integer.MAX_VALUE);
        Queue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(Pair::getKey));


        cumulativeDistance[k] = 0;
        pq.offer(new Pair<>(cumulativeDistance[k], k));

        while(!pq.isEmpty()){
            Pair<Integer, Integer> current = pq.poll();
            int currentDistance = current.getKey();
            int currentLoc = current.getValue();

            for(Pair<Integer, Integer> next: graphs[currentLoc]){
                int nextLoc = next.getKey();
                int timeCost = next.getValue();

                if(currentDistance + timeCost < cumulativeDistance[nextLoc]){
                    cumulativeDistance[nextLoc] = currentDistance + timeCost;
                    pq.offer(new Pair<>(cumulativeDistance[nextLoc], nextLoc));
                }
            }
        }

        final int maxD = Arrays.stream(cumulativeDistance).max().getAsInt();
        return maxD == Integer.MAX_VALUE? -1 : maxD;
    }
}
