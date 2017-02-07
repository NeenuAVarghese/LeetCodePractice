/*
Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<Integer> val1 = new Stack<Integer>();
        Stack<Integer> val2 = new Stack<Integer>();
        
        while(l1!=null){
            val1.push(l1.val);
            l1=l1.next;
        }
        
        while(l2!=null){
            val2.push(l2.val);
            l2=l2.next;
        }
        
        int carry=0, sum=0;
        ListNode head = null;
        
        while(!val1.isEmpty() || !val2.isEmpty()){
            sum = (val1.isEmpty()?0:val1.pop()) + (val2.isEmpty()?0:val2.pop()) + carry;
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum);
            newNode.next = head;
            head = newNode;
        }
        
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
        }
        
        return head;
        
    }
}