/*
    Finding the Nth node From the End in a single Iteration 


    
 */


public class nthNodeFromEndInOneIteration {
    public static void traversal(Node head){
        while (head != null) {
            System.out.println(head.val);
        }
    }
    public static class Node {
        int val ;
        Node next;
        Node(int val){
            this.val = val;
        }
        
    }
    public static Node nthNode(Node head, int n){

        Node slow  = head;
        Node fast = head;
        for(int i =0 ; i< n ; i++){
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return  slow;

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


        // 5,6,7,8,9,10

        Node temp = nthNode(a,2 );
        System.out.println(temp.val);




        
    }
}
