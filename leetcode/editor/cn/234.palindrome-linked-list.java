//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针

package editor.cn;

import editor.ListNode;

import java.util.List;

class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode r = null;
            while (slow != null) {
                ListNode t = new ListNode(slow.val);
                t.next = r;
                r = t;
                slow = slow.next;
            }
            while (r != null && head != null) {
                if (r.val != head.val) {
                    return false;
                }
                r = r.next;
                head = head.next;
            }
            return true;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)


}