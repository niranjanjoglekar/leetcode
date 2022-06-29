package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjanjoglekar on 29/06/22
 */
public class BinaryTreePostorderTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postTraverse(root);
        return list;
    }

    void postTraverse(TreeNode node) {
        if (node == null) {
            return;
        }

        postTraverse(node.left);
        postTraverse(node.right);
        list.add(node.val);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(double v) {}

        TreeNode(int val) {this.val = val;}

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
