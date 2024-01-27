/*
    Given a linked list, split it into two lists such that one contain odd values,
    while the other contain even values.





*/






public class SplitLLIntoOddAndEven {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){this.val=val;}
    }
    public static void split(ListNode head){

        if(head==null||head.next==null){
            System.out.println("This List is Empty");
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode startEven = even;
        while(even != null && even.next != null && odd!=null && odd.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        System.out.println("Odd Values");
        while (head != null) {
            System.out.println(head.val+",");
            head = head.next;
        }
        System.out.println("Even Values");
        while (startEven != null) {
            System.out.println(startEven.val+",");
            startEven = startEven.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
