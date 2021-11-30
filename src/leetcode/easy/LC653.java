package leetcode.easy;

import java.util.HashSet;

public class LC653 {
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode653 root, int k) {
        if(root == null)
            return false;
        return solv(root, k);
    }

    boolean solv(TreeNode653 root, int k) {
        if(root == null)
            return false;
        if(set.contains(k - root.val))
            return true;
        set.add(root.val);
        return solv(root.left, k) || solv(root.right, k);
    }

}


//Definition for a binary tree node.
class TreeNode653 {
    int val;
    TreeNode653 left;
    TreeNode653 right;

    TreeNode653() {
    }

    TreeNode653(int val) {
        this.val = val;
    }

    TreeNode653(int val, TreeNode653 left, TreeNode653 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

