package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC114 {
    static List<TreeNode> list = new ArrayList<>();

    public void flatten(TreeNode root) {
        preorder(root);
        TreeNode node = list.get(0);

        for(int i=0; i<list.size(); i++) {
            TreeNode curr = list.get(i);
            node.left = null;
            node.right = curr;
            node = curr;
        }
    }

    void preorder(TreeNode root) {
        if(root == null)
            return;
        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
