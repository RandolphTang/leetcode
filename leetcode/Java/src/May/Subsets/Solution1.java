package May.Subsets;

public class Solution1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        dfs(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int[] nums, int index, List<Integer> path, List<List<Integer>> ans){
        ans.add(new ArrayList(path));

        for(int i = index; i < nums.length; i++){
            path.add(nums[i]);
            dfs(nums, i + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }
}
