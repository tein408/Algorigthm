package leetcode.easy;

public class LC235 {

    public TreeNode235 lowestCommonAncestor(TreeNode235 root, TreeNode235 p, TreeNode235 q) {
        if(root == null)
            return null;

        if(root == p || root == q)
            return root;

        int parent = root.val;
        int left = p.val;
        int right = q.val;

        //p, q가 root보다 크면 root의 오른쪽 탐색
        if(left > parent && right > parent)
            return lowestCommonAncestor(root.right, p, q);
        //p, q가 root보다 작으면 root의 왼쪽 탐색
        if(left < parent && right < parent)
            return lowestCommonAncestor(root.left, p, q);
        else
            return root;
    }

}


// Definition for a binary tree node.
class TreeNode235 {
    int val;
    TreeNode235 left;
    TreeNode235 right;

    TreeNode235(int x) {
        val = x;
    }
}
