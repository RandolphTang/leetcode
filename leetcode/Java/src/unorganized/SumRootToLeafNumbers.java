package unorganized;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {

        if(root == null){
            return 0;
        }

        int currSum = 0;

        return calculateSumNumbers(root, currSum);

    }

    private int calculateSumNumbers(TreeNode root, int currSum){

        if(root == null){
            return 0;
        } else if(root.left == null && root.right == null){
            return (currSum + root.val);
        } else {
            currSum += root.val;
        }

        return calculateSumNumbers(root.left, currSum * 10) + calculateSumNumbers(root.right, currSum * 10);
    }
}
