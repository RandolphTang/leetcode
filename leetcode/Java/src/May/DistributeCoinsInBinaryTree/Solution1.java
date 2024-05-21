package May.DistributeCoinsInBinaryTree;

public class Solution1 {
    private int steps;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return steps;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;

        int l = dfs(root.left);
        int r = dfs(root.right);

        steps += Math.abs(l) + Math.abs(r);

        return (root.val - 1) + l + r;
    }
}
