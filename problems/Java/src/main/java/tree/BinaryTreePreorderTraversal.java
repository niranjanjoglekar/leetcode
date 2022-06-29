package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author niranjanjoglekar on 29/06/22
 */
public class BinaryTreePreorderTraversal {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        root.left.left = node3;
        root.left.right = node4;
        root.right.left = node5;
        root.right.right = node6;

        BinaryTreePreorderTraversal traversal = new BinaryTreePreorderTraversal();
        traversal.preorderTraversal(root);
        for(int i : list){
            System.out.print(i + " ");
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        traversePreOrder(root);
        return list;
    }

    //Using recursion to traverse tree
    void traversePreOrder(TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
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