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
    public int goodNodes(TreeNode root) {
        return check(root,Integer.MIN_VALUE);
    }
    public int check(TreeNode root,int max){
        if(root==null) return 0;
        int count=0;
        if(root.val>=max){
            count=1;
            max=root.val;
        }
        int l=check(root.left,max);
        int r=check(root.right,max);

        return count+l+r;
    }
}
