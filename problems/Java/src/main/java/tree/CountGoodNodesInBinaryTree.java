package tree;

/**
 * @author niranjanjoglekar on 28/06/22
 *
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 *              3
 *            /  \
 *           1    4
 *          /    / \
 *         3    1   5
 *
 * Input: root = [3,1,4,3,null,1,5]
 * Output: 4
 */
public class CountGoodNodesInBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(5);
        root.left = node1;
        root.left.left = node2;
        root.right = node3;
        root.right.left = node4;
        root.right.right = node5;

        CountGoodNodesInBinaryTree tree = new CountGoodNodesInBinaryTree();
        System.out.print(tree.goodNodes(root));
    }

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countGoodNode(root, Integer.MIN_VALUE);
    }

    public int countGoodNode(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        int ans = 0;
        if (max <= node.val) {
            ans = 1;
        }
        max = Math.max(node.val, max);
        int left = countGoodNode(node.left, max);
        int right = countGoodNode(node.right, max);
        ans += left + right;
        return ans;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {this.val = val;}

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}