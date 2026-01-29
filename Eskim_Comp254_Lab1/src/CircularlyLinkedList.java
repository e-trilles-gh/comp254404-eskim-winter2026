public class CircularlyLinkedList<E> implements Cloneable {
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

    //instance variables fo the CircularlyLinkedList
    private Node<E> tail = null;
    private int size = 0;
    public CircularlyLinkedList() { }

    //access methods
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    //update methods
    public void rotate() {
        if (tail != null)
            tail = tail.getNext();
    }


    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> head = tail.getNext();
        if (head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        System.out.println("Element added: " + e);
        size++;
    }

    public CircularlyLinkedList<E> clone() throws CloneNotSupportedException  {
        CircularlyLinkedList<E> clonedVersion = (CircularlyLinkedList<E>) super.clone();
        if (size > 0) {
            clonedVersion.tail = new Node<>(tail.getElement(), null);
            clonedVersion.tail.setNext(clonedVersion.tail);
            Node<E> walkNode = tail;
            Node<E> tempNode = clonedVersion.tail;
            for (int i = size; i > 1; i-- ) {
                Node<E> newNode = new Node<>(walkNode.getNext().getElement(), tempNode.getNext());
                tempNode.setNext(newNode);
                walkNode = walkNode.getNext();
                tempNode = tempNode.getNext();
            }
        }
        return clonedVersion;
    }
}
