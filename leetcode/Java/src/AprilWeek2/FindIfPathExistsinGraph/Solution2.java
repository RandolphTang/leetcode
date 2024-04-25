package AprilWeek2.FindIfPathExistsinGraph;

public class iSolution2 {
    private int[] disjointSet;

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        disjointSet = new int[n];

        for(int i = 0; i < n; i++){
            disjointSet[i] = i;
        }

        for(int[] edge: edges){
            int node1 = find(edge[0]);
            int node2 = find(edge[1]);
            if(node1 != node2){
                disjointSet[node1] = node2;
            }
        }

        return find(source) == find(destination);


    }

    public int find(int node){
        while(disjointSet[node] != node){

            disjointSet[node] = disjointSet[disjointSet[node]];
            node = disjointSet[node];

        }

        return node;
    }
}
