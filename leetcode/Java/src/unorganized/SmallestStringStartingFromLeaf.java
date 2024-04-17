package unorganized;

public class SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }

    private String ans = null;

    private void dfs(TreeNode node, StringBuilder sb){
        if(node == null){
            return;
        }

        sb.append((char)('a' + node.val));

        if(node.left== null && node.right == null){
            final String path = sb.reverse().toString();
            sb.reverse();
            if(ans == null || ans.compareTo(path) > 0){
                ans = path;
            }
        }

        dfs(node.left, sb);
        dfs(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);


    }
}
