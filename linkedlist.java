
/**
        Linkedlist

 */
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


public  class linkedlist {
    public static void traversal (Node head){
        while (head != null) {
            System.out.println(" "+head.val);
            head = head.next; 
        }
    }

    public static Node creatNode (Node ptr, int val){
        Node temp = new Node(val);
        Node head = ptr;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(13);
        Node c = new Node(14);
        Node d = new Node(15);
        Node e = new Node(16);
        Node f = new Node(17);
        Node g = new Node(18);
        Node h = new Node(19);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = null;
        
        creatNode(a, 100);
        traversal(a);


    }
}