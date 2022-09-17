//给定一个单链表 L 的头节点 head ，单链表 L 表示为：
//
//
//L0 → L1 → … → Ln - 1 → Ln
//
//
// 请将其重新排列后变为：
//
//
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//
// 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
//
//
//
// 示例 1：
//
//
//
//
//输入：head = [1,2,3,4]
//输出：[1,4,2,3]
//
// 示例 2：
//
//
//
//
//输入：head = [1,2,3,4,5]
//输出：[1,5,2,4,3]
//
//
//
// 提示：
//
//
// 链表的长度范围为 [1, 5 * 104]
// 1 <= node.val <= 1000
//
// Related Topics 栈 递归 链表 双指针

package editor.cn;

import editor.ListNode;

import java.util.ArrayList;
import java.util.List;

class ReorderList{
    public static void main(String[] args) {
        Solution solution = new ReorderList().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList2(ListNode head) {
        List<ListNode> a = new ArrayList<>();
        while (head != null) {
            a.add(head);
            head = head.next;
        }
        int i = 0, j = a.size() - 1;
        while (i < j) {
            a.get(i).next = a.get(j);
            i++;
            if (i == j) break;
            a.get(j).next = a.get(i);
            j--;
        }
        a.get(i).next = null;
    }
    /** 空间复杂度 O（1） */
    public void reorderList(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode reverse = reverse(middle.next);
        merge(head, reverse);
    }
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast =head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode t = head;
        ListNode pre = null;
        while (t != null) {
            ListNode n = t.next;
            t.next = pre;
            pre = t;
            t = n;
        }
        return head;
    }
    public void merge(ListNode a, ListNode b) {
        ListNode a1;
        ListNode b1;
        while (a != null && b != null) {
            a1 = a.next;
            b1 = b.next;
            
            a.next = b;
            a = a1;
            b.next = a;
            b = b1;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
