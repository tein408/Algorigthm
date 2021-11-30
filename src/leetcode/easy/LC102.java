package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC102 {

    public List<List<Integer>> levelOrder(TreeNode102 root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode102> que = new LinkedList<>();
        que.offer(root);

        if(root == null)
            return ans;

        while(!que.isEmpty()) {
            List<Integer> temp = new ArrayList();
            int n = que.size();
            for(int i=0; i<n; i++) {
                TreeNode102 curr = que.poll();
                temp.add(curr.val);
                if(curr.left != null)
                    que.offer(curr.left);
                if(curr.right != null)
                    que.offer(curr.right);
            }
            ans.add(temp);
        }
        return ans;
    }

}


// Definition for a binary tree node.
class TreeNode102 {
    int val;
    TreeNode102 left;
    TreeNode102 right;

    TreeNode102() {
    }

    TreeNode102(int val) {
        this.val = val;
    }

    TreeNode102(int val, TreeNode102 left, TreeNode102 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
