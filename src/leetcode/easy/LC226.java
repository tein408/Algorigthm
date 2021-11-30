package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class LC226 {

    public TreeNode226 invertTree(TreeNode226 root) {
        if(root == null)
            return root;

        Queue<TreeNode226> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            TreeNode226 node = que.poll();

            TreeNode226 temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left != null)
                que.add(node.left);
            if(node.right != null)
                que.add(node.right);
        }
        return root;
    }

}

//Definition for a binary tree node.
class TreeNode226 {
    int val;
    TreeNode226 left;
    TreeNode226 right;

    TreeNode226() {
    }

    TreeNode226(int val) {
        this.val = val;
    }

    TreeNode226(int val, TreeNode226 left, TreeNode226 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}