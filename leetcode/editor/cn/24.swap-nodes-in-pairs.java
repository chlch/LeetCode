//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表

package editor.cn;

import editor.ListNode;

class SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
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
        public ListNode swapPairs(ListNode head) {
            ListNode cur = new ListNode(0);
            cur.next = head;
            while (cur != null && cur.next != null) {
                ListNode first = cur.next;
                ListNode sec = cur.next.next;
                first.next = sec;
                sec.next = first;
                cur = first;
            }
            return head;
        }

        public void test(String characters, int combinationLength) {

        }

        public String next() {
            return null;
        }

        public boolean hasNext() {
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}