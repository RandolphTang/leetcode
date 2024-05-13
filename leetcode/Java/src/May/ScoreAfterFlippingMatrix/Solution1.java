package May.ScoreAfterFlippingMatrix;

public class Solution1 {
    public int matrixScore(int[][] grid) {
        grid = rowCheck(grid);
        grid = colCheck(grid);
        int sum = 0;

        for(int i = 0; i < grid.length; i++){
            int curr = 0;
            for(int j = 0; j < grid[0].length; j++){
                curr = (curr << 1) | grid[i][j];
            }


            sum += curr;
        }

        return sum;

    }

    private int[][] rowCheck(int[][] grid){
        boolean flipRow = false;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][0] == 0) flipRow = true;

                if(flipRow){
                    grid[i][j] = grid[i][j] ^ 1;
                }
            }

            flipRow = false;
        }

        return grid;
    }

    private int[][] colCheck(int[][] grid){
        for (int j = 0; j < grid[0].length; j++) {
            int countZero = 0;
            int countOne = 0;

            // Count zeros and ones in the column
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 0) countZero++;
                else countOne++;
            }

            // If there are more zeros than ones, flip the entire column
            if (countZero > countOne) {
                for (int i = 0; i < grid.length; i++) {
                    grid[i][j] = grid[i][j] ^ 1; // XOR flip 0 to 1 and 1 to 0
                }
            }
        }
        return grid;
    }
}
