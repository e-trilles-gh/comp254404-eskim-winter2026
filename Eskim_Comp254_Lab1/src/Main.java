//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //======================= Exercise 1 driver ===========================
/*
        DoublyLinkedList<Integer> lDoublyLinkedList = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> mDoublyLinkedList = new DoublyLinkedList<>();

        System.out.println("LinkList L:");
        lDoublyLinkedList.addFirst(1);
        lDoublyLinkedList.addLast(2);
        lDoublyLinkedList.addLast(3);
        lDoublyLinkedList.addLast(4);
        System.out.println("list node count: " + lDoublyLinkedList.size());
        System.out.println("Element inside first node: " + lDoublyLinkedList.first());
        System.out.println("Element inside last node: " + lDoublyLinkedList.last() + "\n");

        System.out.println("LinkList M:");
        mDoublyLinkedList.addFirst(5);
        mDoublyLinkedList.addLast(6);
        mDoublyLinkedList.addLast(7);
        mDoublyLinkedList.addLast(8);
        System.out.println("list node count: " + mDoublyLinkedList.size());
        System.out.println("Element inside first node: " + mDoublyLinkedList.first());
        System.out.println("Element inside last node: " + mDoublyLinkedList.last() + "\n");

        lDoublyLinkedList.addLastList(mDoublyLinkedList);
        System.out.println("Link M added to the Link L.");

        System.out.println("This is the newly created Link list:");
        System.out.println("Element inside first node: " + lDoublyLinkedList.first());
        System.out.println("Element inside last node: " + lDoublyLinkedList.last() + "\n");

        System.out.println("Element inside M list's first node: " + mDoublyLinkedList.first());
        System.out.println("Element inside M list's last node: " + mDoublyLinkedList.last() + "\n");

        System.out.println("Node count of link list L: " + lDoublyLinkedList.size());
        System.out.println("Node count of link list M: " + mDoublyLinkedList.size() + "\n");

        System.out.println("LinkList M:");
        mDoublyLinkedList.addFirst(9);
        mDoublyLinkedList.addLast(10);
        mDoublyLinkedList.addLast(11);
        mDoublyLinkedList.addLast(12);
        System.out.println("Link list node count: " + mDoublyLinkedList.size());
        System.out.println("Element inside first node: " + mDoublyLinkedList.first());
        System.out.println("Element inside second node: " + mDoublyLinkedList.second());
        System.out.println("Element inside last node: " + mDoublyLinkedList.last() + "\n");

        //===================== End of Exercise 1 driver =================================

        //============================ Exercise 2 ================================

        mDoublyLinkedList.swapFirstAndSecondNodes();
        System.out.println("\nElement inside first node: " + mDoublyLinkedList.first());
        System.out.println("Element inside second node: " + mDoublyLinkedList.second());
*/

/*
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println("SinglyLinkedList object created.");
        singlyLinkedList.addFirst("apple");
        singlyLinkedList.addLast("banana");
        singlyLinkedList.addLast("cherry");
        singlyLinkedList.addLast("dates");

        System.out.println("\nFirst and second node elements");
        System.out.println("Element inside first node: " + singlyLinkedList.first());
        System.out.println("Element inside second node: " + singlyLinkedList.second() + "\n");

        System.out.println("\nSwapping first and second nodes\n");
        singlyLinkedList.swapFirstAndSecondNodes();

        System.out.println("Element inside first node: " + singlyLinkedList.first());
        System.out.println("Element inside second node: " + singlyLinkedList.second());

        //======================= End of Exercise 2 driver ========================
*/

/*
        //============================= Exercise 3 ================================

        CircularlyLinkedList<Integer> circularlyLinkedList1 = new CircularlyLinkedList<>();
        System.out.println("CircularlyLinkedList A with 4 nodes created.");
        circularlyLinkedList1.addFirst(1);
        circularlyLinkedList1.addLast(2);
        circularlyLinkedList1.addLast(3);
        circularlyLinkedList1.addLast(4);

        System.out.println("This is the first element: " + circularlyLinkedList1.first());
        System.out.println("This is the last element: " + circularlyLinkedList1.last() + "\n");

        System.out.println("CircularlyLinkedList A cloned.\n");
        CircularlyLinkedList<Integer> clonedList = new CircularlyLinkedList<>();
        try {
            clonedList = circularlyLinkedList1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("4 nodes added to circularlylinkedlist A.");
        circularlyLinkedList1.addFirst(5);
        circularlyLinkedList1.addLast(6);
        circularlyLinkedList1.addLast(7);
        circularlyLinkedList1.addLast(8);

        System.out.println("\nThis is the first element of cloned list: " + clonedList.first());
        System.out.println("This is the last element of cloned list: " + clonedList.last());
        System.out.println("Node count of cloned list: " + clonedList.size());

        System.out.println("\nThis is the first element of circularlylinkedlist A: " + circularlyLinkedList1.first());
        System.out.println("This is the last element of circularlylinkedlist A: " + circularlyLinkedList1.last());
        System.out.println("Node count of circularlylinkedlist A: " + circularlyLinkedList1.size());

 */
    }
}