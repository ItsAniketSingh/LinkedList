/*
    328. Odd Even Linked List (Medium)

    Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, 
    and return the reordered list.
    The first node is considered odd, and the second node is even, and so on.
    Note that the relative order inside both the even and odd groups should remain as it was in the input.
    You must solve the problem in O(1) extra space complexity and O(n) time complexity.

    

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 */



public class OddEvenLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){this.val=val;}
    }



    public static ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode startEven = even;
        while(even != null && even.next != null && odd!=null&&odd.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = startEven;
        
        return head;
        
    }

    public static void traversal(ListNode head) {
        while (head != null) {
            System.out.println(" " + head.val);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(12);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(14);
        ListNode d = new ListNode(15);
        ListNode e = new ListNode(16);
        ListNode f = new ListNode(17);
        ListNode g = new ListNode(18);
        ListNode h = new ListNode(19);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = null;

        traversal(a);
        System.out.println();
        traversal(oddEvenList(a));
        
        
    }
    
}
