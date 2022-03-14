//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 回溯算法

package editor.cn;

import java.util.ArrayList;
import java.util.List;

class GenerateParentheses{
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrack(res, "", 0, 0, n);
        return res;
    }
    public void backTrack(List<String> res, String s, int left, int right, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (left < n) {
            backTrack(res, s + "(", left + 1, right, n);
        }
        if (left > right) {
            backTrack(res, s + ")", left, right + 1, n);
        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}