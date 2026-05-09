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
    public int kthSmallest(TreeNode root, int k) {
      
        List<Integer>n=new ArrayList<>(k);
          inorder(root,n);
              return n.get(k-1);
    }
        void inorder(TreeNode root,List<Integer> n){
            if(root==null){
            return ;

        }
        inorder(root.left,n);
        n.add(root.val);
        inorder(root.right,n);
 }
        
    
}
