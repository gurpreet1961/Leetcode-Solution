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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key> root.val){
            root.right = deleteNode(root.right,key);
        }else{
            //Now Found the key -> We have different cases
            //1. when it don't have right the return the left value
            //2. when it don't have left then return the right value
            //(_these two case will cover the when it don't have both becase the the value of left right will be null so we will be returing the null)
            //3. when it both the val them
            //3.1 find successor in right side because the it have the larger element 
            //3.2 for findoing the successor while the left value not null go to left side
            //3.3 now just put the value of that successor in place of root value(then node which we have to delete)
            //3.4 now we have to that successor node so give another recursive call to the root. right with key = successor value.

            //Case 1
            if(root.right == null){
                return root.left;
            }
            //case 2
            else if(root.left == null){
                return root.right;
            }
            //case 3
            TreeNode successor = root.right;
            //finding the successor
            while(successor.left != null){
                successor = successor.left;
            }
            //changing the value of the key node with the successor node
            root.val = successor.val;
            //now delete that successor node
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }
}