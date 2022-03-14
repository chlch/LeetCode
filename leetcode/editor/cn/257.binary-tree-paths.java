//给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。 
//
// 叶子节点 是指没有子节点的节点。 
// 
//
// 示例 1： 
//
// 
//输入：root = [1,2,3,null,5]
//输出：["1->2->5","1->3"]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：["1"]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [1, 100] 内 
// -100 <= Node.val <= 100 
// 
// Related Topics 树 深度优先搜索 字符串 二叉树

package editor.cn;

import editor.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class BinaryTreePaths{
    public static void main(String[] args) {
        Solution solution = new BinaryTreePaths().new Solution();
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(res, root, "");
        return res;
    }
    public void dfs(List<String> res, TreeNode node, String path) {
        if (node == null) return;
        if (!path.equals("")) {
            path += "->";
        }
        path += node.val;
        if (node.left == null && node.right == null) {
            res.add(path);
        }
        dfs(res, node.left, path);
        dfs(res, node.right, path);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}