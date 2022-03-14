//Given a non-empty array of integers, every element appears twice except for on
//e. Find that single one. 
//
// Note: 
//
// Your algorithm should have a linear runtime complexity. Could you implement i
//t without using extra memory? 
//
// Example 1: 
//
// 
//Input: [2,2,1]
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: [4,1,2,1,2]
//Output: 4
// 
// Related Topics Hash Table Bit Manipulation

package editor.en;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class SingleNumber{
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        int[] nums = {4,1,2,1,2};
        System.out.println(solution.singleNumber(nums));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        AtomicInteger res = new AtomicInteger(0);
//        map.entrySet().forEach(e -> {
//            if (e.getValue().intValue() == 1) {
//                res.set(e.getKey());
//            }
//        });
//        return res.get();
//    }

        /**
         *  an array - [2,1,4,5,2,4,1].
         *  ^ 操作可交换，相同数字^操作后为0
         * => 0 ^ 2 ^ 1 ^ 4 ^ 5 ^ 2 ^ 4 ^ 1
         *
         * => 0^ 2^2 ^ 1^1 ^ 4^4 ^5 (Rearranging, taking same numbers together)
         *
         * => 0 ^ 0 ^ 0 ^ 0 ^ 5
         *
         * => 0 ^ 5
         *
         * => 5 :)
          * @param nums
         * @return
         */
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}