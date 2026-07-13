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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode curr=head;
        int n=1;
        while(curr.next!=null){
            curr=curr.next;
            n++;
        }
        k%=n;
        int size=n-k;
        curr.next=head;
        ListNode newCurr=head;
        for(int i=1;i<size;i++){
            newCurr=newCurr.next;
        }
        ListNode newHead=newCurr.next;
        newCurr.next=null;
        return newHead;
    }
}