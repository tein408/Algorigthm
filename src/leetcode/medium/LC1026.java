package leetcode.medium;

public class LC1026 {

    int answer;

    public int maxAncestorDiff(TreeNode1026 root) {
        if(root == null)
            return 0;

        answer = 0;
        solv(root, root.val, root.val);

        return answer;
    }

    void solv(TreeNode1026 node, int max, int min) {
        if(node == null)
            return;

        int temp = Math.max(Math.abs(max - node.val), Math.abs(min - node.val));
        answer = Math.max(temp, answer);

        max = Math.max(max, node.val);
        min = Math.min(min, node.val);
        solv(node.left, max, min);
        solv(node.right, max, min);
        return;
    }

}


//Definition for a binary tree node.
class TreeNode1026 {
    int val;
    TreeNode1026 left;
    TreeNode1026 right;

    TreeNode1026() {
    }

    TreeNode1026(int val) {
        this.val = val;
    }

    TreeNode1026(int val, TreeNode1026 left, TreeNode1026 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

