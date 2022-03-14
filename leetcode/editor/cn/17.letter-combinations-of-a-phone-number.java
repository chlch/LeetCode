//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// 示例 2： 
//
// 
//输入：digits = ""
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：digits = "2"
//输出：["a","b","c"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= digits.length <= 4 
// digits[i] 是范围 ['2', '9'] 的一个数字。 
// 
// Related Topics 哈希表 字符串 回溯

package editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
        solution.letterCombinations("23");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> letterCombinations(String digits) {
            String[] a = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            LinkedList<String> q = new LinkedList<>();
            if(digits.isEmpty()) return q;
            q.add("");
            int n = digits.length();
            for(int i=0;i<n;i++) {
                int num = digits.charAt(i) - '0';
                String key = a[num];
                while(q.peek().length() != (i+1)) {
                    String f = q.poll();
                    for(int j = 0; j < key.length(); j++) {
                        q.add(f + key.charAt(j));
                    }
                }

            }
            return q;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}