package leetcode.medium;

//Definition for a binary tree node.
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() { }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}

public class LC129 {

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    int sum(TreeNode root, int n) {
        if(root == null)
            return 0;

        int sum = 0;

        if(root.left != null) {
            sum += sum(root.left, root.val + n*10);
        }
        if(root.right != null) {
            sum += sum(root.right, root.val + n*10);
        }
        if(root.left == null && root.right == null) {
            sum = root.val + n*10;
        }

        return sum;
    }

}




