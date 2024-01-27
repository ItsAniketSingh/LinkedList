/*
    141. Linked List Cycle

    Given head, the head of a linked list, determine if the linked list has a cycle in it.
    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
    Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

    Return true if there is a cycle in the linked list. Otherwise, return false.


 */

public class CycleDectation {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    public static boolean cyclicCheck(Node head) {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }

        while (fast != null) {
            if (slow == null)
                return false;
            slow = slow.next;
            if (fast.next == null)
                return false;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        Node g = new Node(11);
        Node h = new Node(12);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        h.next = b;
        System.out.println(cyclicCheck(a));

    }
}
