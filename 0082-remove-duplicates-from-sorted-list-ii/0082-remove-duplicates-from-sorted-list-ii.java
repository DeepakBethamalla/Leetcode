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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        
        while(current != null){
            
           while(current.next != null && prev.next.val == current.next.val){
               current = current.next;
           }
            
            if(prev.next == current){
                prev = prev.next;
            }else{
                prev.next = current.next;
            }
            
            current = current.next;
        }
        return dummy.next;
    }
}