/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class LC404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);

    }
    int sum(TreeNode root) {
        if(root==null)
            return 0;
        int sum = 0;

        if(root.left!=null) {
            if(root.left.left == null && root.left.right == null)
                sum += root.left.val;
            else
                sum += sum(root.left);
        }
        sum += sum(root.right);
        return sum;
    }
}