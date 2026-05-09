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
    public List<Integer> rightSideView(TreeNode root) {
       ArrayList<Integer>r=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
       if(root==null){
        return r;
       }
        que.add(root);
        while(!que.isEmpty()){
            int len=que.size();
            int lastnode=0;
           
            for(int i=0;i<len;i++){
                 TreeNode node=que.poll();
                 lastnode=node.val;
            if(node.left!=null){
                que.add(node.left);
            }
            if(node.right!=null){
                que.add(node.right);
            }
            
            }
            r.add(lastnode);
        }
        return r;
    }
}
