/*
    876
    Given the head of a singly linked list, return the middle node of the linked list.

    If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.


 */





 public class MiddleOfTheLinkedList {

    
    public static class Node {
    
        int val;
        Node next;
        Node(int val){this.val = val;}
    }
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        Node g = new Node(11);
        Node h = new Node (12);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
    }
}
