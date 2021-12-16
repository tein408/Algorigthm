package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LC1145 {

    int n, x;
    boolean check = false;
    Map<TreeNode1145, Integer> map = new HashMap<>();

    public boolean btreeGameWinningMove(TreeNode1145 root, int n, int x) {
        if(root.left == null && root.right == null)
            return false;

        this.n = n;
        this.x = x;

        map.put(root, search(root));

        return check;
    }

    int search(TreeNode1145 root) {
        if(root == null)
            return 0;

        int left = search(root.left);
        int right = search(root.right);

        map.put(root, left + right + 1);

        int a = 0, b = 0;
        if(root.val == x) {
            if(root.left != null) {
                a += map.get(root.left);
            }
            if(root.right != null) {
                b += map.get(root.right);
            }
            if((a+b+1) < (n-a-b-1))
                check = true;
            else {
                int c = Math.max(a, b);
                int d = Math.min(a, b);

                if(c > (n-a-b) + d)
                    check = true;
            }
        }
        return left + right + 1;
    }

}

//Definition for a binary tree node.
class TreeNode1145 {
    int val;
    TreeNode1145 left;
    TreeNode1145 right;

    TreeNode1145() {
    }

    TreeNode1145(int val) {
        this.val = val;
    }

    TreeNode1145(int val, TreeNode1145 left, TreeNode1145 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


