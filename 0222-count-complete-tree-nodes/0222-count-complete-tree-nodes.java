/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int lh = 0, rh = 0;
        TreeNode ln = root, rn = root;
        while(ln != null){ lh++; ln = ln.left; }
        while(rn != null){ rh++; rn = rn.right; }
        if(lh == rh) return (1 << lh) -1;
        return 1 + countNodes(root.left) + countNodes(root.right);
        
    }
}