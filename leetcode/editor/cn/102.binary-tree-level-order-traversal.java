//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层序遍历结果： 
//
// 
//[
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 二叉树

package editor.cn;

import editor.TreeNode;

import java.util.*;

class BinaryTreeLevelOrderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
        TreeNode treeNode = new TreeNode(1, null, null);
        treeNode.left  = new TreeNode(1, null, null);
        treeNode.right = new TreeNode(1, null, null);
        solution.levelOrder2(treeNode);
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> q = new LinkedList<>();
        q.push(root);
        while (!q.isEmpty()) {
            int nums = q.size(); // each level has nums nodes
            List<Integer> sub = new ArrayList<>();
            for (int i=0; i<nums; i++) {
                TreeNode pop = q.poll();
                sub.add(pop.val);
                if (pop.left != null) {
                    q.offer(pop.left);
                }
                if (pop.right != null) {
                    q.offer(pop.right);
                }
            }
            res.add(sub);

        }
        return res;
    }
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }

    public void dfs(TreeNode root, int height, List<List<Integer>> res) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(height).add(root.val);
        dfs(root.left, height + 1, res);
        dfs(root.right, height + 1, res);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}