/*
    148. Sort List
    Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Example 3:
Input: head = []
Output: []
 */


public class SortList {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val=val;}
    }


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
          return head;
            
        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
        }
        
        prev.next = null;
        
        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        // step 3. merge l1 and l2
        return merge(l1, l2);
      }
      
      ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;
        
        while (l1 != null && l2 != null) {
          if (l1.val < l2.val) {
            p.next = l1;
            l1 = l1.next;
          } else {
            p.next = l2;
            l2 = l2.next;
          }
          p = p.next;
        }
        
        if (l1 != null)
          p.next = l1;
        
        if (l2 != null)
          p.next = l2;
        
        return l.next;
      }
    public static void main(String[] args) {
        
    }
    
}
