package May.LargestLocalValuesinaMatrix;

public class Solution1 {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] newG = new int[n - 2][n - 2];

        for(int i = 0; i < newG.length; i++){
            for(int j = 0; j < newG.length; j++){
                newG[i][j] = maxFinder(grid, i, j);
            }
        }

        return newG;

    }

    private int maxFinder(int[][] grid, int col, int row){
        int max = grid[col][row];
        for(int i = col; i <= col + 2; i++){
            for(int j = row; j <= row + 2; j++){
                max = Math.max(max, grid[i][j]);
            }
        }

        return max;
    }
}
