package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LC144 {

    public List<Integer> preorderTraversal(TreeNode144 root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    void preorder(TreeNode144 root, List<Integer> list) {
        if(root == null)
            return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }


}


// Definition for a binary tree node.
class TreeNode144 {
    int val;
    TreeNode144 left;
    TreeNode144 right;

    TreeNode144() {
    }

    TreeNode144(int val) {
        this.val = val;
    }

    TreeNode144(int val, TreeNode144 left, TreeNode144 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
