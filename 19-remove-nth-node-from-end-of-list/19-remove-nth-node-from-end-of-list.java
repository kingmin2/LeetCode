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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        
        //p1과 p2사이에 n 만큼의 갭 생성
        for(int i = 0; i < n+1; i++){
            p1 = p1.next;
        }
        
        
        //p1 이 마지막에 다다를 때까지 움직인다
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        //p1 은 null p2의 다음 노드가 삭제 대상
        p2.next = p2.next.next;
        
        return dummy.next;
        
        
    }
}