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
    int preidx=0;
    public TreeNode build(int[] preorder,int start, int end,Map<Integer,Integer> m){
        if(start>end) return null;
        int rootval = preorder[preidx++];
        TreeNode root=new TreeNode(rootval);
        int mid=m.get(rootval);
        root.left=build(preorder,start,mid-1,m);
        root.right=build(preorder,mid+1,end,m);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> m = new HashMap<>();
         for(int i = 0; i < inorder.length; i++){
            m.put(inorder[i], i);
        }
        return build(preorder,0,inorder.length - 1,m);
    }
}
