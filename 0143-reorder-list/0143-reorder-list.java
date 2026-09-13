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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        Stack<ListNode> stack = new Stack<>();
        
        ListNode temp = head;
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        temp = head;
        
        while(temp != null){
            ListNode last = stack.pop();
            if(temp == last || temp.next == last){
                last.next = null;
                break;
            }
            
            ListNode next = temp.next;

            temp.next = last;
            last.next = next;
            temp = next;
            
        }
        
    }
}