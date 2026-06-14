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

    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        while(root != null){

            // both on left side
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }

            // both on right side
            else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }

            // split point found
            else{
                return root;
            }
        }

        return null;
    }
}