//实现 strStr() 函数。
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。
//
// 说明：
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
//
//
//
// 示例 1：
//
//
//输入：haystack = "hello", needle = "ll"
//输出：2
//
//
// 示例 2：
//
//
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
//
//
//
//
// 提示：
//
//
// 1 <= haystack.length, needle.length <= 104
// haystack 和 needle 仅由小写英文字符组成
//
// Related Topics 双指针 字符串 字符串匹配

package editor.cn;

import java.util.Arrays;
import java.util.concurrent.Executors;

/**
 * KMP 算法
 */
class ImplementStrstr {
    
    public static void main(String[] args) {
        Solution solution = new ImplementStrstr().new Solution();
        int[] abcdefgs = solution.kmpNext("abcabggg");
        Arrays.stream(abcdefgs).forEach(System.out::println);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        
        public int strStr(String haystack, String needle) {
            return 0;
        }
        
        public int[] kmpNext(String str) {
            int[] next = new int[str.length()];
            next[0] = 0;
            for (int i = 1, j = 0; i < str.length(); i++) {
                while (j > 0 && str.charAt(i) != str.charAt(j)) {
                    j = next[j - 1];
                }
                if (str.charAt(i) == str.charAt(j)) {
                    j++;
                }
                next[i] = j;
            }
            return next;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
    
    
}
