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
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        q.add(root);
        while(q.size()>0){
            int len = q.size();
            for(int i = len; i > 0 ; i--){
                TreeNode node = q.poll();
                if(node.right != null){
                    q.add(node.right);
                }
                if(node.left != null){
                    q.add(node.left);
                }

                if( i == len){
                    al.add(node.val);
                }
            }
        }
        return al;
    }
}