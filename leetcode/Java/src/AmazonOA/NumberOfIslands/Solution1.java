package AmazonOA.NumberOfIslands;

public class Solution1 {
    // BFS

    public int numIslands(char[][] grid) {

        int sum = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    bfs(grid, i, j);
                    sum++;
                }
            }
        }
        return sum;
    }

    private static final int[][] directions = {{0, 1},{1,0},{0, -1},{-1,0}};

    private void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{r, c});
        grid[r][c] = '2';// marked '2' as visited

        while(!q.isEmpty()){
            final int i = q.peek()[0];
            final int j = q.poll()[1];
            for(int[] dir: directions){
                final int x = i + dir[0];
                final int y = j + dir[1];
                if(x < 0 || x == grid.length || y < 0 || y == grid[0].length) continue;
                if(grid[x][y] != '1') continue;

                q.offer(new int[]{x, y});
                grid[x][y] = '2'; // marked '2' as visited
            }
        }
    }
}
