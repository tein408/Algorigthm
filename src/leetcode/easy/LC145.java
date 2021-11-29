package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC145 {

    public List<Integer> postorderTraversal(TreeNode145 root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        return list;
    }

    void postOrder(TreeNode145 root, List<Integer> list) {
        if(root == null)
            return;
        if(root.left != null) postOrder(root.left, list);
        if(root.right != null) postOrder(root.right, list);
        list.add(root.val);
    }

}

//Definition for a binary tree node.
class TreeNode145 {
    int val;
    TreeNode145 left;
    TreeNode145 right;

    TreeNode145() {
    }

    TreeNode145(int val) {
        this.val = val;
    }

    TreeNode145(int val, TreeNode145 left, TreeNode145 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
