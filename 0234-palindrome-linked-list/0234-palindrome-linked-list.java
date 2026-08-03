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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

   /*  public ListNode findMiddle(ListNode head) {
        ListNode h = head;
        ListNode t = head;
        while (h.next != null && h.next.next != null) {
            h = h.next.next;
            t = t.next;
        }
        return t;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode sHs = reverse(middle.next);
        ListNode fhs = head;

        while (sHs != null) {
            if (fhs.val != sHs.val) {
                return false;
            }
            fhs = fhs.next;
            sHs = sHs.next;
        }
        return true;
    }

        */

        public boolean isPalindrome(ListNode head){
              ListNode slow = head;
              ListNode fast = head;
              while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

              }
              ListNode p2 = reverse(slow);
              ListNode p1 = head;
              while(p1 != null && p2 != null){
                if(p1.val != p2.val){
                  return  false;
                }
                p1 = p1.next;
                p2 = p2.next;
              }
              return true;
        }
}
