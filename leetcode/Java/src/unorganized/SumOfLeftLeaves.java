package unorganized;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){
            return 0;
        }

        return dfs(root, false);

    }

    private int dfs(TreeNode node, boolean isLeft){

        if(node == null){
            return 0;
        } else if(node.left == null && node.right == null && isLeft){
            return node.val;
        }

        return dfs(node.left, true) + dfs(node.right, false);
    }
}
