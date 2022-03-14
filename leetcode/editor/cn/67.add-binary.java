//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟

package editor.cn;

class AddBinary {
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
        System.out.println(solution.addBinary("11","1"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder s = new StringBuilder();
            int carry = 0;
            int i = a.length() - 1, j = b.length() - 1;
            while (i >= 0 || j >= 0) {
                int sum = carry;
                if (i >= 0) {
                    sum  += a.charAt(i--) - '0';
                }
                if (j >= 0) {
                    sum += b.charAt(j--) - '0';
                }
                if (sum > 1) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                s.append(sum % 2);
            }
            if (carry > 0) s.append(carry);
            return s.reverse().toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}