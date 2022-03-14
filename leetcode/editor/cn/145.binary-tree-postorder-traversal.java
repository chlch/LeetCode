//给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树

package editor.cn;

import editor.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class BinaryTreePostorderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
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
//    public List<Integer> postorderTraversal2(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//    public void helper(TreeNode node, List<Integer> res) {
//        if (node == null) return;
//        helper(node.left, res);
//        helper(node.right, res);
//        res.add(node.val);
//    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> q = new LinkedList<>();
        q.push(root);
        while (!q.isEmpty()) {
            TreeNode treeNode = q.pop();
            res.add(0, treeNode.val);
            if (treeNode.left != null) {
                q.push(treeNode.left);
            }
            if (treeNode.right != null) {
                q.push(treeNode.right);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}