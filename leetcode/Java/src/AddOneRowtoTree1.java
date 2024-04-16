public class AddOneRowtoTree1 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }

        insert(root, val, depth);
        return root;
    }

    private void insert(TreeNode node, int val, int depth){
        if(node == null) return;

        if(depth == 2) {
            TreeNode temp = node.left;
            node.left = new TreeNode(val);
            node.left.left = temp;

            temp = node.right;
            node.right = new TreeNode(val);
            node.right.right = temp;
        } else {
            insert(node.left, val, depth - 1);
            insert(node.right, val, depth - 1);
        }

    }
}
