//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
// Related Topics 数组 动态规划

package editor.cn;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangle().new Solution();
        System.out.println(solution.generate2(5));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> pre = new ArrayList<>();
                if (i - 1 == -1) {
                    pre.add(1);
                    res.add(pre);
                    continue;
                } else {
                    pre = res.get(i - 1);
                }
                List<Integer> t = new ArrayList<>();
                t.add(1);
                for (int j = 0; j < pre.size() - 1; j++) {
                    t.add(pre.get(j) + pre.get(j + 1));
                }
                t.add(1);
                res.add(t);
            }
            return res;
        }

        public List<List<Integer>> generate2(int numRows) {
            List<List<Integer>> allrows = new ArrayList<List<Integer>>();
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int i = 0; i < numRows; i++) {
                row.add(0, 1);
                for (int j = 1; j < row.size() - 1; j++)
                    row.set(j, row.get(j) + row.get(j + 1));
                allrows.add(new ArrayList<Integer>(row));
            }
            return allrows;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}