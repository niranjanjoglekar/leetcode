package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjanjoglekar on 29/06/22
 */
public class BinaryTreeInorderTraversal {

    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return result;
    }

    void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        result.add(node.val);
        inorder(node.right);
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
