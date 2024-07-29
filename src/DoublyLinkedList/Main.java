package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList mydll=new DoublyLinkedList(65);
        mydll.append(59);
        mydll.append(76);
        mydll.prepend(69);
        mydll.append(87);
        mydll.prepend(55);
        System.out.println("Doubly Linked List");
        mydll.printList();
        System.out.println("DLL after inderting 22 at index 2");
        mydll.insert(2,22);
        mydll.printList();
        System.out.println("Removing Node at index 3");
        mydll.remove(3);
        mydll.printList();
    }
}
