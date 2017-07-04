/**
* Given a linked list, determine if it has a cycle in it.
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        
        Map<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        
        while(head != null){
            
            if(hashMap.containsKey(head)){
                return true;
            }
            else{
                hashMap.put(head, 1);
            }
            
            head = head.next;
        }
        
        return false;

    }
}