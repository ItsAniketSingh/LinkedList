/*
    21 Merge Two Sorted Lists
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val){this.val = val;}
        
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummy;

        ListNode n1 = list1;
        ListNode n2 = list2;

        while (n1 != null && n2 != null) {
            if (n1.val <= n2.val) {
                current.next = n1;
                n1 = n1.next;
            } else {
                current.next = n2;
                n2 = n2.next;
            }
            current = current.next;
        }

        // If one of the lists is not exhausted, append the remaining elements
        if (n1 != null) {
            current.next = n1;
        } else {
            current.next = n2;
        }

        return dummy.next; // The merged list starts from the next of the dummy node
    }

    public static void main(String[] args) {

    }

}
