package leetcode.easy;

public class LC938 {

    public int rangeSumBST(TreeNode938 root, int low, int high) {

        int ans = 0;

        if(root.val >= low && root.val <= high)
            ans += root.val;

        ans += rangeSumBST(root.right, low, high);
        ans += rangeSumBST(root.left, low, high);

        return ans;

    }

}


//Definition for a binary tree node.
class TreeNode938 {
  int val;
  TreeNode938 left;
  TreeNode938 right;
  TreeNode938() {}
  TreeNode938(int val) { this.val = val; }
  TreeNode938(int val, TreeNode938 left, TreeNode938 right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

