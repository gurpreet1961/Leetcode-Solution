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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        if(root == null){
            return al;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean oddLevel = false;
        while(q.size()>0){
            List<Integer> curLevel = new ArrayList<>();
            int curLevelSize = q.size();
            for(int i=0; i < curLevelSize; i++){
                TreeNode cur = q.poll();

                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
                curLevel.add(cur.val);
            }
            if(oddLevel){
                Collections.reverse(curLevel);
                oddLevel = false;
            }else{
                oddLevel = true;
            }
            al.add(curLevel);
        }
        return al;
    }
}