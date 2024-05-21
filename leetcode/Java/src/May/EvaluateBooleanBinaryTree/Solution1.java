package May.EvaluateBooleanBinaryTree;

public class Solution1 {
    public boolean evaluateTree(TreeNode root) {

        if(root.left == null && root.right == null) return root.val == 1 ? true : false;

        return root.val == 3 ? evaluateTree(root.left) && evaluateTree(root.right) :
                evaluateTree(root.left) || evaluateTree(root.right);

    }
}
