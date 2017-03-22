/*
 *Given a singly linked list, group all odd nodes together followed by the even nodes. 
You should try to do it in place. The program should run in O(1) space complexity
 and O(nodes) time complexity.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class OddEvenLinkList {
    public ListNode oddEvenList(ListNode head) {
        
        ListNode temp = head;
        int i = 1;
        
        ListNode even = null;
        ListNode odd =null;
        
        while(temp != null){
            
            if(i % 2 == 0){
                even = addToList(even, temp.val);
            }
            else{
                odd = addToList(odd, temp.val);
            }
            i++;
            temp = temp.next;
        }
        
        temp = odd;
        if(odd != null){
            while(temp.next != null){
            temp = temp.next;
            }
        
            temp.next= even;
            return odd;
        }
        
        
        
        return even;
        
    }
    
    
    public ListNode addToList(ListNode head, int val){
        
        ListNode temp = head;
        
        if(temp == null){
            temp = new ListNode(val);
            return temp;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            
            temp.next =new ListNode(val);
             return head;
        }
        
       
    }
}