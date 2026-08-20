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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(-1);
        ListNode t = d2;
        ListNode t2 = d1;

        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                d1.next = temp;
                temp = temp.next;
                d1 = d1.next;
            }else{
                d2.next = temp;
                temp = temp.next;
                d2 = d2.next;
            }
            
        }
        d2.next = null;
        d1.next = t.next;
        return t2.next;

        
    }
}