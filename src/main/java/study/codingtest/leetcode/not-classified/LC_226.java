package study.codingtest.leetcode;

public class LC_226 {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return root;
    }
    TreeNode newNode = new TreeNode(root.val);
    newNode.left = invertTree(root.right);
    newNode.right = invertTree(root.left);
    return newNode;
  }

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}