package May.PalindromePartitioning;

public class Solution1 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        dfs(s, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void dfs(String s, int index, List<String> path, List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i + 1));
                dfs(s, i + 1, path, ans);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int index, int i){
        while(index < i){
            if(s.charAt(index++) != s.charAt(i--)) return false;
        }

        return true;
    }
}
