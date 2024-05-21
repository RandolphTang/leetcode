package May.DeleteLeavesWithaGivenValue;

public class Solution1 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        return isLeafNode(root) && root.val == target ? null : root;
    }

    private boolean isLeafNode(TreeNode root){
        return root.left == null && root.right == null;
    }
}
