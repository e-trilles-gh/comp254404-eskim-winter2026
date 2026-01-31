public class CircularlyLinkedList<E> implements Cloneable {
    //nested Node class
    private static class Node<E> {
        private E element;
        private Node<E> next;
        //Node constructor that accepts data type and object Node
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        //returns the saved element
        public E getElement() { return element; }
        //returns the referenced Node
        public Node<E> getNext() { return next; }
        //sets the reference for the next Node using the argument which is the Node object
        public void setNext(Node<E> n) { next = n; }
    }

    //instance variables fo the CircularlyLinkedList
    //initializes the tail as null
    private Node<E> tail = null;
    //holds the total number of nodes
    private int size = 0;
    //empty CircularlyLinkedList constructor
    public CircularlyLinkedList() { } //empty CircularlyLinkedList constructor

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
        //creating variable for object to be cloned
        CircularlyLinkedList<E> clonedVersion = (CircularlyLinkedList<E>) super.clone();
        //checks if the list contains nodes
        if (size > 0) {
            //creates an object Node with parameter and setting its element the same as the tail's element
            clonedVersion.tail = new Node<>(tail.getElement(), null);
            //sets the reference for the next node the same as the tail's next node
            clonedVersion.tail.setNext(clonedVersion.tail);
            //references the tail as walkNode
            Node<E> walkNode = tail;
            //references the cloned version's tail as tempNode
            Node<E> tempNode = clonedVersion.tail;
            //saves every node into a new node
            for (int i = size; i > 1; i-- ) {
                //creates a node that was referenced by the previous node
                Node<E> newNode = new Node<>(walkNode.getNext().getElement(), tempNode.getNext());
                //walks forward using reference nodes to update changes
                tempNode.setNext(newNode);
                walkNode = walkNode.getNext();
                tempNode = tempNode.getNext();
            }
        }
        clonedVersion.size = size;
        //returns the whole linkedList
        return clonedVersion;
    }
}
