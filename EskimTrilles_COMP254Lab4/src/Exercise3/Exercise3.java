package Exercise3;

public class Exercise3 {

// Exercise 3 - This method can be found and implemented inside Exercise3.SinglyLinkedList.java class

//    public void concatenate(Exercise3.SinglyLinkedList<E> list2) {
//
//        // last node of the 1st list
//        System.out.println(this.tail.getNext());
//        Exercise3.SinglyLinkedList.Node<E> lastNode = this.tail;
//
//        // two ends of the 2nd list - the first and last node
//        Exercise3.SinglyLinkedList.Node<E> list2FirstNode = list2.head;
//        Exercise3.SinglyLinkedList.Node<E> list2LastNode = list2.tail;
//
//        // appends the 2nd list to the last node of first list
//        lastNode.setNext(list2FirstNode);
//
//        // points the tail to the last node of 2nd list
//        this.tail.setNext(list2LastNode);
//
//        // update node count
//        this.size += list2.size();
//
//        // sets the head and tail of the 2nd list to null
//        list2.head = null;
//        list2.tail = null;
//    }

    LinkedQueue<Integer> queue1 = new LinkedQueue<Integer>();
    LinkedQueue<Integer> queue2 = new LinkedQueue<Integer>();

    private void addQueue() {
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);
        queue1.enqueue(60);

        queue2.enqueue(500);
        queue2.enqueue(501);
        queue2.enqueue(502);
        queue2.enqueue(503);
        queue2.enqueue(504);

        System.out.println("\nQueues added to the list.\n");
        System.out.println("Q1 size: " + queue1.size() +
                "\nQ1 first element: " + queue1.first() + "\n");

        System.out.println("Q2 size: " + queue2.size() +
                "\nQ2 first element: " + queue2.first() + "\n");
    }

    public void append2to1() {
        System.out.println("\nExercise 3.");

        addQueue();
        queue1.concatenate(queue2);

        System.out.println("Queues concatenated.\n");

        try {
            System.out.println("Q1 size: " + queue1.size() +
                    "\nQ1 first element: " + queue1.first() + "\n");
        }
        catch (Exception e) {
            System.out.println("Exercise3.Queue 1 is empty. Error: " + e);
        }

        try {
            System.out.println("Q2 size: " + queue2.size() +
                    "\nQ2 first element: " + queue2.first() + "\n");
        }
        catch (Exception e) {
            System.out.println("Exercise3.Queue 2 is empty. Error: " + e);
        }
    }
}
