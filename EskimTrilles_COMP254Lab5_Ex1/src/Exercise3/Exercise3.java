package Exercise3;

public class Exercise3 {
    /*
        // Exercise3

        // This method is found and implemented inside the HeapPriorityQueue.java

        // This method is called during insertion of new node with new element so that the
        // path from the newly inserted node going to the root is always following the
        // rule where the node with the lowest key will be placed at the top of higher
        // key value

        protected void upheap(int j) {
            // exits the recursion if index is 0
            if (j == 0) {
                return;
            }

            // captures the index of parent node
            int p = parent(j);

            // if result is < 0 means j is smaller than parent
            // then swapping between child and parent and recursion is needed
            if (compare(heap.get(j), heap.get(p)) < 0) {
                swap(j, p);
                j = p;
                upheap(j);
            }
        }

    */
    HeapPriorityQueue<Integer, String> priorityQueue = new HeapPriorityQueue<Integer, String>();

    private void insertItems() {
        priorityQueue.insert(23, "Apple");
        priorityQueue.insert(9, "Cherry");
        priorityQueue.insert(18, "Mango");
        priorityQueue.insert(75, "Orange");
        priorityQueue.insert(98, "Dates");
        priorityQueue.insert(84, "Kiwi");
        priorityQueue.insert(35, "Pineapple");

    }

    public void runExercise3() {
        System.out.println("\nExercise 3\n");

        insertItems();
        System.out.println("Items inserted.\nSize of Heap: " + priorityQueue.size() + "\n");
        System.out.println("Minimum value: " + priorityQueue.min().getValue() + "\n");

        priorityQueue.insert(5, "Avocado");
        System.out.println("Smallest value inserted.\nNew Size of Heap: " + priorityQueue.size() + "\n");
        System.out.println("New minimum value: " + priorityQueue.min().getValue());
    }
}
