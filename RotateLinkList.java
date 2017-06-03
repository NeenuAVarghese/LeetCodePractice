/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || k == 0 || k <= Integer.MIN_VALUE || k >= Integer.MAX_VALUE){
            return head;
        }
        int len = 1;
        ListNode tempNode = head;
        
        while(tempNode.next != null){
            len++;
            tempNode = tempNode.next;
        }
        
        tempNode.next = head;
        
        for(int i = len - k%len; i > 1; i--){  
            System.out.println(head.val);
            head = head.next;
        }
        tempNode = head.next;
        head.next = null;
        return tempNode;
    }
}