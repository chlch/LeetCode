//集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有
//一个数字重复 。 
//
// 给定一个数组 nums 代表了集合 S 发生错误后的结果。 
//
// 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,4]
//输出：[2,3]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,1]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 104 
// 1 <= nums[i] <= 104 
// 
// Related Topics 哈希表 数学

package editor.cn;

import java.util.HashSet;
import java.util.Set;

class SetMismatch{
    public static void main(String[] args) {
        Solution solution = new SetMismatch().new Solution();
        System.out.println(solution.findErrorNums(new int[]{1,3,3})[0] + " " + solution.findErrorNums(new int[]{1,3,3})[1]);

    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if (set.contains(nums[i])) {
                res[0] = nums[i];
            } else {
                set.add(nums[i]);
                sum += nums[i];
            }
        }
        res[1] = (1+nums.length)*nums.length/2 - sum;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}