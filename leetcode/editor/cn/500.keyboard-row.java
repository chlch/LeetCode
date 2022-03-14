//给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。 
//
// 美式键盘 中： 
//
// 
// 第一行由字符 "qwertyuiop" 组成。 
// 第二行由字符 "asdfghjkl" 组成。 
// 第三行由字符 "zxcvbnm" 组成。 
// 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["Hello","Alaska","Dad","Peace"]
//输出：["Alaska","Dad"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["omk"]
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：words = ["adsdf","sfd"]
//输出：["adsdf","sfd"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 20 
// 1 <= words[i].length <= 100 
// words[i] 由英文字母（小写和大写字母）组成 
// 
// Related Topics 哈希表

package editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class KeyboardRow{
    public static void main(String[] args) {
        Solution solution = new KeyboardRow().new Solution();
        System.out.println(solution.findWords(new String[]{"a","b"})[0]);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            boolean q = true, a=true, z=true;
            String s = words[i];
            String slow = s.toLowerCase();
            int k = 0;
            int j;
            for (j=0; j<s.length(); j++) {
                if ("qwertyuiop".indexOf(slow.charAt(j)) > -1 && q) {
                    a = false;z = false;k++;continue;
                }
                if ("asdfghjkl".indexOf(slow.charAt(j)) > -1 && a) {
                    q = false;z = false;k++;continue;
                }
                if ("zxcvbnm".indexOf(slow.charAt(j)) > -1 && z) {
                    a = false;q = false;k++;continue;
                }
            }
            if (k == j) {
               res.add(s);
            }
        }
        return res.toArray(new String[0]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}