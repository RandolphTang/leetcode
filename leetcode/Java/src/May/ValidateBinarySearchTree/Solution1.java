package May.ValidateBinarySearchTree;

public class Solution1 {
    public boolean isValidBST(TreeNode root) {
        TreeNode minNode = null;
        TreeNode maxNode = null;
        return isValidBST(root, minNode, maxNode);
    }

    private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode){

        if(root == null) return true;
        else if(maxNode != null && root.val >= maxNode.val) return false;
        else if(minNode != null && root.val <= minNode.val) return false;

        return isValidBST(root.left, minNode, root) &&
                isValidBST(root.right, root, maxNode);
    }
}
