package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LC919 {


    TreeNode919 root;
    Queue<TreeNode919> que;

    public LC919(TreeNode919 root) {
        this.root = root;
        que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            TreeNode919 poll = que.peek();
            if(poll.left != null && poll.right != null) {
                que.add(poll.left);
                que.add(poll.right);
                que.poll();
            } else if(poll.left != null) {
                que.add(poll.left);
                break;
            } else {
                break;
            }
        }

    }

    public int insert(int val) {
        TreeNode919 treeNode = new TreeNode919(val);//2
        TreeNode919 node = que.peek();//1
        que.add(treeNode);//1 , 2

        if(node.left == null) {
            node.left = treeNode;
        }
        else if(node.right == null) {
            node.right = treeNode;
            que.poll();
        }

        return node.val;
    }

    public TreeNode919 get_root() {
        return this.root;
    }

}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * leetcode.medium.TreeNode919 param_2 = obj.get_root();
 */

//Definition for a binary tree node.
class TreeNode919 {
    int val;
    TreeNode919 left;
    TreeNode919 right;

    TreeNode919() {
    }

    TreeNode919(int val) {
        this.val = val;
    }

    TreeNode919(int val, TreeNode919 left, TreeNode919 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}