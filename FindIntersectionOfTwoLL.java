/*
    160
    Finding the Intersection of two Linked List



 */



public class FindIntersectionOfTwoLL {
    public static class Node {
        int val;
        Node next;
        Node(int val){this.val = val;}    
    }


    public static void traversal (Node head){
        while (head != null) {
            System.out.print(" "+head.val);
            head = head.next;
        }
        System.out.println();
    }


    public static void findTheIntersection(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int size_of_head1 = 0;
        int size_of_head2 = 0;

        while (temp1 != null) {
            size_of_head1 ++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            size_of_head2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;
       

        int n = size_of_head1- size_of_head2;
        for(int i = 0; i< n; i++ ){
            temp1 = temp1.next;
        }
        while (temp1 != temp2) {
          temp1= temp1.next;
          temp2 = temp2.next;
        }
        System.out.println(temp1.val);
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

        Node l = new Node(100);
        Node m = new Node(101);
        Node n = new Node(102);

        l.next = m;
        m.next = n;

        n.next = f;

        traversal(a);
        traversal(l);

        findTheIntersection(a, l);
    }
}
