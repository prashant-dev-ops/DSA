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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        
        for(int i = 1;i<k;i++){
            temp = temp.next;
        }
        ListNode temp1 = head;
        int size = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            size++;
        }
        temp1 = head;
        for(int i = 1;i<size-k+1;i++){
            temp1 = temp1.next;
        }
        
        int temp2 = temp.val;
        temp.val = temp1.val;
        temp1.val = temp2;

        return head;
    }
}