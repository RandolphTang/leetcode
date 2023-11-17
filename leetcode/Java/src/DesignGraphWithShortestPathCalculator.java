public class DesignGraphWithShortestPathCalculator {

        private List<Pair<Integer, Integer>>[] graph;

        public Graph(int n, int[][] edges) {
                graph = new List[n];
                for (int i = 0; i < n; ++i)
                        graph[i] = new ArrayList<>();
                for(int[] edge: edges){
                        addEdge(edge);
                }
        }

        public void addEdge(int[] edge) {
                final int origin = edge[0];
                final int destination = edge[1];
                final int distance = edge[2];
                graph[origin].add(new Pair<>(destination, distance));
        }

        public int shortestPath(int node1, int node2) {
                int[] overallD = new int[graph.length];
                Arrays.fill(overallD, Integer.MAX_VALUE);
                Queue<Pair<Integer, Integer>> minD = new PriorityQueue<>(Comparator.comparing(Pair::getKey));

                overallD[node1] = 0;
                minD.offer(new Pair<>(overallD[node1], node1));

                while(!minD.isEmpty()) {
                        final int currD = minD.peek().getKey();
                        final int currL = minD.poll().getValue();

                        if(currL == node2) {
                                return currD;
                        }

                        for(Pair<Integer, Integer> next: graph[currL]) {
                                final int nextL = next.getKey();
                                final int nextD = next.getValue();
                                if(nextD + currD < overallD[nextL]) {
                                        overallD[nextL] = currD + nextD;
                                        minD.offer(new Pair<>(overallD[nextL], nextL));
                                }
                        }
                }
                return -1;
        }


}
