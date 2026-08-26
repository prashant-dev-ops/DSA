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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arry = new ArrayList<>();
        if(lists == null){
            return null;
        }
        for(ListNode node : lists){
            while(node != null){
                arry.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(arry);
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for(int value : arry){
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next; 

        }
        
        
    }
