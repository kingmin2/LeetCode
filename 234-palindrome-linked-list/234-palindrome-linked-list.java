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
        
        boolean answer = true;
        
   
        ArrayList<Integer> aList = new ArrayList<>();
       
        while(head.next != null){
            int tmp = head.val;
            head = head.next;
            aList.add(tmp);
        }
        aList.add(head.val);
        int size = aList.size();
        for(int i = 0; i < size/2; i++){
            if(aList.get(i) != aList.get(size-1-i)) answer = false;
        }
        
        
        return answer;
        
    }
}