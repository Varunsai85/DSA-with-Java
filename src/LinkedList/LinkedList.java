package LinkedList;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    public LinkedList(int value){
        Node new_node=new Node(value);
        head=new_node;
        tail=new_node;
        length=1;
    }
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
