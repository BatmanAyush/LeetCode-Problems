import java.util.*;

import javax.swing.tree.TreeNode;

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
    public List<Integer> postorderTraversal(TreeNode root) {
       Stack <TreeNode> s1 = new Stack<>();
        ArrayList<Integer> batman = new ArrayList<>();
        Stack<TreeNode>s2 = new Stack<>();
        if(root==null){
            return batman;
        }
    s1.push(root);
    while(!s1.isEmpty()){
        TreeNode temp = s1.pop();
        s2.push(temp);
    if(temp.left!=null){
        s1.push(temp.left);
    }
    if(temp.right!=null){
        s1.push(temp.right);
    }

    
    }

while(!s2.isEmpty()){
    TreeNode wayne = s2.pop();
    batman.add(wayne.val);
}
    return batman;
    
    }
}
class postorderTraversal{
    public static void main(String[] args) {
        
    }
}