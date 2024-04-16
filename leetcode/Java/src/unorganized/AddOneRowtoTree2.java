package unorganized;

public class AddOneRowtoTree2 {
    //runtime: N as well
    //but less space
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }

        int currD = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(currD < depth - 1){
            Queue<TreeNode> temp = new LinkedList<>();
            while(!q.isEmpty()){
                TreeNode curr = q.remove();
                if(curr.left != null) temp.add(curr.left);
                if(curr.right != null) temp.add(curr.right);
            }

            currD++;
            q = temp;
        }

        while(!q.isEmpty()){
            TreeNode node = q.remove();
            TreeNode temp = node.left;
            node.left = new TreeNode(val);
            node.left.left = temp;

            temp = node.right;
            node.right = new TreeNode(val);
            node.right.right = temp;
        }
        return root;
    }
}
