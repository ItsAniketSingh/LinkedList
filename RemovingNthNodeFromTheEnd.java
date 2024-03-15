/*
    Remove the Nth node From the End in a single Iteration 







 */




public class RemovingNthNodeFromTheEnd {

    public static class Node {
        int val;
        Node next;
        Node (int val) {this.val = val;}
    }

    public static void traversal(Node head){
        while (head != null){
            System.out.print (" " +head.val);
            head = head.next;
        }
        System.out.println();
    }
    public static Node removingNthNode(Node head, int n ){
        Node slow = head;
        Node fast = head;
        Node curr;
        for(int i =0 ; i< n; i++){
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        curr = slow.next.next;
        slow.next = curr;
        return head; 
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

        traversal(a);
        Node temp = removingNthNode(a, 6);
        traversal(temp); 

        
    }
}
