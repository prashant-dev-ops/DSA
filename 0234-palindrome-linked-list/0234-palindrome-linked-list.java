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
    public boolean isPalindrome(ListNode head) {
        List<Integer> arry = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arry.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int j = arry.size()-1;
        while(i<j){
            int a = arry.get(i);
            int b = arry.get(j);
            if(a != b) return false;
            i++;
            j--;
        }
        return true;
        
    }
}