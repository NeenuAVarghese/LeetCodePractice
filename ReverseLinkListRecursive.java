/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
       return reverse(head, null);
    }
    
    public ListNode reverse(ListNode head, ListNode tempHead){
        if(head == null){
            return tempHead;
        }
        
        ListNode next = head.next;
        head.next = tempHead;
        return reverse(next, head);
    }
}