package April.FindAllGroupsofFarmland;

public class Solution2 {
    public int[][] findFarmland(int[][] land) {
        List<int[]> ans = new ArrayList<>();

        for(int i = 0; i < land.length;i++){
            for(int j = 0; j < land[0].length; j++){
                if(land[i][j] == 1){

                    dfs(land, i, j, land.length, land[0].length);
                    ans.add(new int[]{i, j, h, k});
                    h = 0; k = 0;
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    private int h = 0;
    private int k = 0;

    public void dfs(int[][] land, int i, int j, int m, int n) {
        if(i < 0 || i == m || j < 0 || j == n || land[i][j] == 0){
            return;
        }

        land[i][j] = 0;
        h = Math.max(h, i);
        k = Math.max(k, j);
        dfs(land, i + 1, j, m, n);
        dfs(land, i, j + 1, m, n);
    }
}
