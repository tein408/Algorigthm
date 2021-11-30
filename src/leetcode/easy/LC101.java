package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class LC101 {

    public boolean isSymmetric(TreeNode101 root) {
        if(root == null)
            return true;
        Queue<TreeNode101> que = new LinkedList<>();
        que.add(root.left);
        que.add(root.right);
        while(!que.isEmpty()) {
            TreeNode101 left = que.poll();
            TreeNode101 right = que.poll();
            if(left == null && right == null)
                continue;
            if(left == null || right == null || left.val != right.val)
                return false;
            //대칭 하여 비교할 순서대로 삽입
            que.add(left.left);
            que.add(right.right);
            que.add(left.right);
            que.add(right.left);
        }
        return que.isEmpty();
    }

}


//Definition for a binary tree node.
class TreeNode101 {
    int val;
    TreeNode101 left;
    TreeNode101 right;

    TreeNode101() {
    }

    TreeNode101(int val) {
        this.val = val;
    }

    TreeNode101(int val, TreeNode101 left, TreeNode101 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
