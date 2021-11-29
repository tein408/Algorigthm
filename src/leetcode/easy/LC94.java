package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC94 {

    public List<Integer> inorderTraversal(TreeNode94 root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    void inorder(TreeNode94 root, List<Integer> list) {
        if(root == null)
            return;
        if(root.left != null)
            inorder(root.left, list);
        list.add(root.val);
        if(root.right != null)
            inorder(root.right, list);
    }

}


//Definition for a binary tree node.
class TreeNode94 {
    int val;
    TreeNode94 left;
    TreeNode94 right;

    TreeNode94() {
    }

    TreeNode94(int val) {
        this.val = val;
    }

    TreeNode94(int val, TreeNode94 left, TreeNode94 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
