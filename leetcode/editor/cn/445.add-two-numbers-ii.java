//给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。 
//
// 你可以假设除了数字 0 之外，这两个数字都不会以零开头。 
//
// 
//
// 进阶： 
//
// 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。 
//
// 
//
// 示例： 
//
// 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 8 -> 0 -> 7
// 
// Related Topics 链表

package editor.cn;

import editor.ListNode;

import java.util.Deque;
import java.util.LinkedList;

class AddTwoNumbersIi{
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbersIi().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<ListNode> s1 = new LinkedList<>();
        Deque<ListNode> s2 = new LinkedList<>();
        while (l1 != null) {
            s1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2);
            l2 = l2.next;
        }
        int sum = 0;
        ListNode a = new ListNode(0);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) sum += s1.pop().val;
            if (!s2.isEmpty()) sum += s2.pop().val;
            a.val = sum % 10;
            ListNode t = new ListNode(sum/10);
            t.next = a;
            a = t;
            sum/=10;
        }
        return a.val == 0 ? a.next : a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}