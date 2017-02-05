/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode temp = null;
        int data;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                data = l1.val;
                l1 = l1.next;
            }
            else if(l1.val > l2.val){
                data = l2.val;
                l2 = l2.next;
            }
            else{
                data = l1.val;
                l1 = l1.next;
            }
            
            if(result == null){
                result = new ListNode(data);
                temp = result;
            }
            else{
                System.out.println(data);
                temp.next = new ListNode(data);
                temp = temp.next;
            }
        }
        while(l1 != null){
             if(result == null){
                result = new ListNode(l1.val);
                temp = result;
            }
            else{
                temp.next = new ListNode(l1.val);
                temp = temp.next;
            }
            l1 = l1.next;
        }
        while(l2 != null){
             if(result == null){
                result = new ListNode(l2.val);
                temp = result;
            }
            else{
                temp.next = new ListNode(l2.val);
                temp = temp.next;
            }
            l2 = l2.next;
        }
        return result;
    }
}