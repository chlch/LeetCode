//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针

package editor.cn;

import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        //-4 -1 -1 0 1 2
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i-1]) {
                    continue;
                }
                int target = -nums[i];
                int j = i + 1, k = nums.length - 1;

                while (j < k) {
                    int sum = nums[j] + nums[k];
                    if (sum == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j+1]) j++;
                        while (j < k && nums[k] == nums[k-1]) k--;
                        j++;
                        k--;
                    } else if (sum > target) {
                        k--;
                    } else {
                        j++;
                    }
                }

            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}