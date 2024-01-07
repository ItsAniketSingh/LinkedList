/*
 



 */

import java.util.LinkedList;

public class MergeTwoSortedLL {

    public static class Node {
        int val;
        Node next;
        Node(int val){this.val=val;}
    }
    

    public static void mergeNode(Node head1, Node head2){
        
        Node temp1 = head1;
        Node temp2 = head2;
        LinkedList<Integer> newList = new LinkedList<>();

        while (temp1 != null && temp2 != null) {
            
            if (temp1.val < temp2.val) {
                newList.add(temp1.val);
                temp1 = temp1.next;
            }
            else if(temp1.val > temp2.val){
                newList.add(temp2.val);
                temp2 = temp2.next;
            }
        }
        while (newList != null) {
            System.out.println();
            
        }
        for(int i : newList){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        
    }
}
