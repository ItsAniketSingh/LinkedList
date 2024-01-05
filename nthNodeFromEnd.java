/*
    Finding the Nth node From the End


 */



public class nthNodeFromEnd {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    public static Node nthNode(Node head, int n){
        int size =0;
        Node temp = head; 
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        n = size - n ;    
        temp = head;
        for(int i =0 ; i< n; i++){
            temp = temp.next;
        }
        return temp;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        //  5, 6, 7, 8, 9, 10
        Node q = nthNode(a, 1 );
        System.out.println(q.val);
    }

}
