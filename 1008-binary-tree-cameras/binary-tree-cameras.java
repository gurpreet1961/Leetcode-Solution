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

    /**
    There are 3 case 
    1. got 0 then not moniter -> so put camera return 2
    2. got 1 then monitered -> no need to put camera return 0
    3. got 2 then there is camera -> no need to put camera return 1
     */
    int ans = 0;
    public int dfs(TreeNode root){
        if(root == null){
            return 1;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        if(l == 0 || r == 0){
            ans++;
            return 2;
        }else if(l==2 || r== 2){
            return 1;
        }else{
            return 0;
        }
    }
    public int minCameraCover(TreeNode root) {
        if(dfs(root) == 0) ans++;
        return ans;
    }
}