public class DoublyLinkedList<E> {
    //nested Node class
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getPrev() { return prev; }
        public Node<E> getNext() { return next; }
        public void setPrev(Node<E> p ) { prev = p; }
        public void setNext(Node<E> n ) { next = n; }
    }//end of nested Node class

    //instance variables of the DoublyLinkedList
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    //Constructs a new empty list
    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    //Returns the number of elements in the linked list.
    public int size() { return size; }

    //Tests whether the linked list is empty
    public boolean isEmpty() { return size == 0; }

    //Returns (but does not remove) the first of the list
    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    //Returns (but does not remove) the last element of the list
    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    //public update methods
    //adds element e to the front of the list
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    //adds element e to the end of the list
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    //removes and returns the first element of the list
    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    //removes and returns the last element of the list
    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    //private update methods
    //adds element e to the linked list in between the given nodes
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        //create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        System.out.println("Node added with element: " + e);
        size++;
    }

    //removes the given node from the list and returns its element
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        size--;
        return node.getElement();
    }

    public E second() {
        return header.getNext().getNext().getElement();
    }

    public void getCount() {
        System.out.println("Node count: " + size);
    }

    public void addLastList(DoublyLinkedList secondLinkList) {
        Node firstNodeOfSecondLinkList = secondLinkList.header.getNext();

        Node lastNodeOfSecondLinkList = secondLinkList.trailer.getPrev();

        Node lastNodeOfFirstLinkList = trailer.getPrev();

        firstNodeOfSecondLinkList.setPrev(lastNodeOfFirstLinkList);
        lastNodeOfSecondLinkList.setNext(trailer);

        lastNodeOfFirstLinkList.setNext(firstNodeOfSecondLinkList);
        trailer.setPrev(lastNodeOfSecondLinkList);

        size = size + secondLinkList.size();

        secondLinkList.size = secondLinkList.size- secondLinkList.size;

        secondLinkList.trailer.setPrev(secondLinkList.header);
        secondLinkList.header.setNext(secondLinkList.trailer);
    }

    public void swapFirstAndSecondNodes() {
        Node firstNode = header.getNext();
        Node secondNode = firstNode.getNext();
        Node thirdNode = secondNode.getNext();
        if (!firstNode.getElement().equals(secondNode.getElement())) {
            header.setNext(secondNode);
            firstNode.setNext(thirdNode);
            firstNode.setPrev(secondNode);
            secondNode.setNext(firstNode);
            secondNode.setPrev(header);
            thirdNode.setPrev(secondNode);
            System.out.println("First and second nodes of link list swapped.");
        } else {
            System.out.println("Both nodes contain the same element. Swap cancelled.");
        }
    }
}
