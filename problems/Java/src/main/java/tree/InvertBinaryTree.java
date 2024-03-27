package tree;

/**
 * @author niranjanjoglekar on 28/06/22
 *     <p>Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return root;
    }

    invertTree(root.left);
    invertTree(root.right);

    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    return root;
  }

  public static class TreeNode {
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
}
