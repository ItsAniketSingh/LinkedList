/*
    61. Rotate List
    Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 */


public class RotateList {
    
    public static class ListNode {
        int val;
        ListNode next;  
        ListNode(int val){this.val=val;}
        
    }


    public int sizeOfList(ListNode head) {
        ListNode pTmp = head;
        int count = 0;
        while (pTmp != null) {
            pTmp = pTmp.next;
            count++;
        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        int size = sizeOfList(head);

        if (size == 0 || k % size == 0) {
            return head;
        }

        int steps = size - k % size;
        ListNode pTmp = head;
        ListNode pPre = null;

        for (int i = 0; i < steps; i++) {
            pPre = pTmp;
            pTmp = pTmp.next;
        }
        pPre.next = null;

        ListNode newHead = pTmp;
        while (pTmp.next != null) {
            pTmp = pTmp.next;
        }
        pTmp.next = head;

        return newHead;
    }
    public static void main(String[] args) {
        
    }
    
}
