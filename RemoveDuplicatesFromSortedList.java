/*
    83. Remove Duplicates from Sorted List
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 */



public class RemoveDuplicatesFromSortedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
        
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        
    }
}
