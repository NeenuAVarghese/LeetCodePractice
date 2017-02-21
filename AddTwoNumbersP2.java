/*
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbersP2 {
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