public class LargestSubmatrixWithRearrangements1 {
    public int largestSubmatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 1; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 1)
                    matrix[i][j] += matrix[i - 1][j];
            }
        }

        int ans = 0;

        for(int[] each: matrix){
            Arrays.sort(each);
            for(int j = 0; j < col; j++){
                ans = Math.max(ans, each[j] * (col - j));
            }
        }

        return ans;
    }
}
