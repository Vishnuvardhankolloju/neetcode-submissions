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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            List<Integer> n=new ArrayList<>();
            int len=que.size();
            for(int i=0;i<len;i++){
                TreeNode node=que.poll();
                 
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
              n.add(node.val);
            }
            result.add(n);
        }
        return result;
    }
}
