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
    public boolean isValidBST(TreeNode root) {
      List<Integer>res=new LinkedList<>();
      help(root,res);
      int prev=res.get(0);
      boolean isbst=true;
      for(int i=1;i<res.size();i++){
       if(res.get(i)<=prev){
       isbst=false;
      
       }
        prev=res.get(i);
      
      }
      return isbst;
    }
    void help(TreeNode root,List<Integer>res){
        if(root==null){
            return;
        }
        help(root.left,res);
        res.add(root.val);
        help(root.right,res);
    }
}
