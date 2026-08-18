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
        ListNode first = head;
        ListNode second = head;
        if(head == null){
            return null;
        }
       
        while(second != null){
            
            if(first.val == second.val){
                second = second.next;
            }
            else{
                first.next = second;
                first = second;
               
            }
        }
        first.next = second;
        return head;
        
    }
}