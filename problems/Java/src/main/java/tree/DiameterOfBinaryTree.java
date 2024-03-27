package tree;

/**
 * @author niranjanjoglekar on 29/06/22
 *     <p>Given the root of a binary tree, return the length of the diameter of the tree.
 *     <p>The diameter of a binary tree is the length of the longest path between any two nodes in a
 *     tree. This path may or may not pass through the root.
 *     <p>The length of a path between two nodes is represented by the number of edges between them.
 */
public class DiameterOfBinaryTree {

  public static void main(String[] args) {

    DiameterOfBinaryTree object = new DiameterOfBinaryTree();

    TreeNode root = new TreeNode(1);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(3);
    TreeNode node3 = new TreeNode(4);
    TreeNode node4 = new TreeNode(5);
    root.left = node1;
    root.right = node2;
    root.left.left = node3;
    root.left.right = node4;

    System.out.print(object.diameterOfBinaryTree(root));
  }

  public int diameterOfBinaryTree(TreeNode root) {
    int[] res = new int[1];
    res[0] = 0;
    process(root, res);
    return res[0];
  }

  public int process(TreeNode node, int[] res) {
    if (node == null) {
      return -1;
    }
    int left = process(node.left, res) + 1;
    int right = process(node.right, res) + 1;

    res[0] = Math.max(res[0], left + right);

    return Math.max(left, right);
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
