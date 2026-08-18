/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int SizeA = 0;
        int SizeB = 0;
        while(tempA != null){
            tempA = tempA.next;
            SizeA++;
        }
        while(tempB != null){
            tempB = tempB.next;
            SizeB++;
        }
        int length = 0;


        tempA = headA;
        tempB = headB;

        if(SizeA > SizeB){
            length = SizeA - SizeB;
            for(int i = 1;i<= length;i++){
                tempA = tempA.next;
            }
        }else{
            length = SizeB - SizeA;
             for(int i = 1;i<= length;i++){
                tempB = tempB.next;
            }
        }
       
        while(tempA != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
        
    }
}