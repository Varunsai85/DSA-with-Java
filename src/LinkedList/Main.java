package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedlist=new LinkedList(5);
        mylinkedlist.append(3);
        mylinkedlist.append(6);
        mylinkedlist.append(8);
        mylinkedlist.append(88);
        mylinkedlist.append(69);
        mylinkedlist.removeFirst();
        mylinkedlist.removeLast();
        mylinkedlist.set(3,69);
        mylinkedlist.insert(1,9);
        mylinkedlist.reverse();
        mylinkedlist.printList();
        System.out.println("Head : "+mylinkedlist.getHead().value);
        System.out.println("Tail : "+mylinkedlist.getTail().value);
        System.out.println("Length : "+mylinkedlist.getLength());
        System.out.println("Get : "+mylinkedlist.get(2).value);
    }
}
