package tree;

/**
 * @author niranjanjoglekar on 28/06/22
 *     <p>Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric
 *     around its center). Example 1: 1 / \ 2 2 / \ / \ 3 4 4 3 Input: root = [1,2,2,3,4,4,3]
 *     Output: true
 */
public class SymmetricTree {

  public static void main(String[] args) {
    SymmetricTree object = new SymmetricTree();
    SymmetricTree.TreeNode treeNode = new TreeNode(1);
    treeNode.left = new TreeNode(2);
    treeNode.right = new TreeNode(2);
    treeNode.left.left = new TreeNode(3);
    treeNode.left.right = new TreeNode(4);
    treeNode.right.left = new TreeNode(4);
    treeNode.right.right = new TreeNode(3);

    System.out.print(object.isSymmetric(treeNode));
  }

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return false;
    }
    return isSymmetric(root.left, root.right);
  }

  boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    } else if (left == null || right == null) {
      return false;
    }

    if (left.val != right.val) {
      return false;
    }

    if (!isSymmetric(left.left, right.right)) {
      return false;
    }
    if (!isSymmetric(left.right, right.left)) {
      return false;
    }

    return true;
  }

  public static class TreeNode {
    int val;
    SymmetricTree.TreeNode left;
    SymmetricTree.TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, SymmetricTree.TreeNode left, SymmetricTree.TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
