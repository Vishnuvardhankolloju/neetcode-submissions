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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int rootv=root.val;
        int pv=p.val;
        int qv=q.val;
    if(pv>rootv && qv>rootv){
        return lowestCommonAncestor( root.right, p, q);

    }
    if(pv<rootv && qv<rootv){
        return lowestCommonAncestor( root.left, p, q);
        }

    else {
            return root;
        }
    }
}
