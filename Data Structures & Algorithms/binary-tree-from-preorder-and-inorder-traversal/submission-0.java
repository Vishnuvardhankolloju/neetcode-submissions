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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return help(preorder,map,0,0,inorder.length-1);

    }
    private TreeNode help(int preorder[],HashMap<Integer,Integer>map,int rightindex,int left,int right){
        TreeNode root=new TreeNode(preorder[rightindex]);
        int mid=map.get(preorder[rightindex]);
        if(mid>left){
            root.left=help(preorder,map,rightindex+1,left,mid-1);

        }
        if(mid<right){
         root.right=help(preorder,map,rightindex-left+mid+1,mid+1,right);

        }
        return root;
    }
}
