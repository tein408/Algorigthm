package leetcode.easy;

public class LC1022 {

    int answer = 0;

    public int sumRootToLeaf(TreeNode1022 root) {
        preOrder(root, 0);
        return answer;
    }

    void preOrder(TreeNode1022 root, int currNum) {
        if(root == null)
            return;

        currNum = currNum * 2 + root.val;

        if(root.left == null && root.right == null) {
            answer += currNum;
        }
        preOrder(root.left, currNum);
        preOrder(root.right, currNum);
    }

}


// Definition for a binary tree node.
class TreeNode1022 {
    int val;
    TreeNode1022 left;
    TreeNode1022 right;

    TreeNode1022() {
    }

    TreeNode1022(int val) {
        this.val = val;
    }

    TreeNode1022(int val, TreeNode1022 left, TreeNode1022 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
