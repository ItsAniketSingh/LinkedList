/*
    897. Increasing Order Search Tree
    Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree,
    and every node has no left child and only one right child.

 

Example 1:
Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

Example 2:
Input: root = [5,1,7]
Output: [1,null,5,null,7]
 */

import java.util.Stack;

import javax.swing.tree.TreeNode;

public class IncreasingOrderSearchTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    Stack<Integer> st = new Stack<>();

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        inorderTraversal(root);
        TreeNode result = new TreeNode(-1, null, null);
        TreeNode cur = result;
        while (!st.isEmpty()) {
            cur.right = new TreeNode(st.pop(), null, null);
            cur = cur.right;
        }
        return result.right;

    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.right);
        st.push(root.val);
        inorderTraversal(root.left);

    }

    public static void main(String[] args) {

    }

}
