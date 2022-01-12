package leetcode.easy;

public class LC617 {

    public TreeNode617 mergeTrees(TreeNode617 root1, TreeNode617 root2) {
        if(root1 == null)
            return root2;
        if(root2 == null)
            return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

}


//Definition for a binary tree node.
class TreeNode617 {
    int val;
    TreeNode617 left;
    TreeNode617 right;

    TreeNode617() {
    }

    TreeNode617(int val) {
        this.val = val;
    }

    TreeNode617(int val, TreeNode617 left, TreeNode617 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

