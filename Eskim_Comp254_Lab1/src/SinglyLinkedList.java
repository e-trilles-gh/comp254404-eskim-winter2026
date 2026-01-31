public class SinglyLinkedList<E> {
    //nested Node class
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    //instance variables of the SinglyLinkedList
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList() { }

    //access methods
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    //update methods
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
        System.out.println("Element added to the first node of linked list: " + e);
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
        System.out.println("Element added to the last node of linked list: " + e);
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }

    public E second() {
        return head.getNext().getElement();
    }

    public void swapFirstAndSecondNodes() {
        //create three nodes
        Node<E> firstNode = head;
        Node<E> secondNode = firstNode.getNext();
        Node<E> thirdNode = secondNode.getNext();

        //verify if two nodes both contain the same item
        if (!firstNode.getElement().equals(secondNode.getElement())) {
            //moving the first node as second node
            firstNode.setNext(thirdNode);
            //moving the second node as first node
            secondNode.setNext(firstNode);
            //making the second node as the head node
            head = secondNode;

            System.out.println("First and second nodes of singlyLinkedList swapped.");
        } else {
            System.out.println("Both nodes contain the same element. Swap cancelled.");
        }
    }
}
