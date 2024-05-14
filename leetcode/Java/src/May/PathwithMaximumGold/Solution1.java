package May.PathwithMaximumGold;

public class Solution1 {

    private int maxA = 0;
    public int getMaximumGold(int[][] grid) {

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    int curr = 0;
                    dfs(grid, i, j, curr);
                }
            }
        }

        return maxA;
    }

    private void dfs(int[][] grid, int i, int j, int max){

        if (maxA < max) maxA = max;

        if(i >= grid.length || j >= grid[0].length
                || i < 0 || j < 0 || grid[i][j] == 0) return;

        int currVal = grid[i][j];
        grid[i][j] = 0;

        dfs(grid, i + 1, j, max + currVal);
        dfs(grid, i - 1, j, max + currVal);
        dfs(grid, i, j + 1, max + currVal);
        dfs(grid, i, j - 1, max + currVal);

        grid[i][j] = currVal;

    }
}
