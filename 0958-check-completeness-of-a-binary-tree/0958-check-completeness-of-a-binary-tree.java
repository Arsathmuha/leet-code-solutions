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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean nullseen = false;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null) nullseen = true;
            else{
                if(nullseen) return false;
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return true;
    }
}