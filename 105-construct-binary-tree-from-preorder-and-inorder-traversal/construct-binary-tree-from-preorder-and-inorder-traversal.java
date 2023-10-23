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
     int index = 0;
    public TreeNode sol(int[] preorder,HashMap<Integer,Integer> hm, int start, int end){
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int idx = hm.get(root.val);
        root.left = sol(preorder,hm, start, idx-1);
        root.right = sol(preorder,hm, idx+1, end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i < inorder.length; i++){
            hm.put(inorder[i],i);
        }

        return sol(preorder,hm, 0, preorder.length-1);
        
    }
}