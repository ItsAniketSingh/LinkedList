/*
 

 */


public class FindOutWhereCycleBegins {

    public static class Node {
        int val;
        Node next;
        Node (int val){this.val = val;}
        
    }
    public static int findout(Node head){
        Node slow = head;
        Node fast = head;
        Node temp = head;
        if (head == null) {
            return -1;
        }
        if(head.next == null){
            return head.val;
        }


        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
            if(slow == temp){
                return temp.val;
            }
        }


        return -1;
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

        h.next = c;
        System.out.println(findout(a));
   
        
    }
}
