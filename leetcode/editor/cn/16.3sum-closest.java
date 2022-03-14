//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和
//。假定每组输入只存在唯一答案。 
//
// 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
//
//与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
// 
// Related Topics 数组 双指针

package editor.cn;

import java.util.Arrays;

class ThreeSumClosest{
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest().new Solution();
        System.out.println(solution.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closet = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        Arrays.sort(nums);


        for (int i=0; i<n-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j=i+1, k = n-1;
            while (j<k) {
                int sum= nums[j]+nums[k]+nums[i];
                int abs = Math.abs(target - sum);
                if (abs < Math.abs(target - closet)) {
                    closet = sum;
                }
                if (sum == target) {
                    break;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return closet;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}