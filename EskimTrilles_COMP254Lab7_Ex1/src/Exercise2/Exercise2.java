package Exercise2;

public class Exercise2 {
    LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();
    LinkedQueue<LinkedQueue<Integer>> queueOfQueues = new LinkedQueue<LinkedQueue<Integer>>();

    public void runExercise2() {
        System.out.println("Exercise 2\n");

        insertQueue();

        createSingleQueue(linkedQueue);

        // merges queues from queueOfQueues while sorting each dequeued queues
        while (queueOfQueues.size() > 1) {
            // first and second queues' elements are dequeued and saved into a queue,
            // then passed to a method as a parameter for sorting and merging into
            // one queue
            LinkedQueue<Integer> queueA = queueOfQueues.dequeue();
            LinkedQueue<Integer> queueB = queueOfQueues.dequeue();
            LinkedQueue<Integer> merged = mergeQueues(queueA, queueB);
            queueOfQueues.enqueue(merged);
        }

        LinkedQueue<Integer> mergedQueue = queueOfQueues.dequeue();

        System.out.println("mergedQueue created with " + mergedQueue.size() + " sorted elements.");

        for (int i = mergedQueue.size(); i > 0 ; i--) {
            System.out.println("mergedQueue size: " + (mergedQueue.size() - 1) + " ; element removed: " + mergedQueue.dequeue());
        }

        System.out.println("\nCurrent size of mergedQueue: " + linkedQueue.size());
    }

    protected void insertQueue() {
        int size;

        linkedQueue.enqueue(23);
        linkedQueue.enqueue(55);
        linkedQueue.enqueue(15);
        linkedQueue.enqueue(8);
        linkedQueue.enqueue(47);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(31);

        size = linkedQueue.size();

        System.out.println("Queue created with " + size + " elements.\n");
    }

    protected void createSingleQueue(LinkedQueue<Integer> queue) {
        // dequeue all the elements from queue, and enqueue each element into
        // individual queue then each individual queue is enqueue into queueOfQueues
        while (!queue.isEmpty()) {
            // singleQueue will hold the individual element from queue
            LinkedQueue<Integer> singleQueue = new LinkedQueue<Integer>();

            // element from queue is enqueue to the singleQueue
            singleQueue.enqueue(linkedQueue.dequeue());

            // enqueues the singleQueue to the queueOfQueues
            queueOfQueues.enqueue(singleQueue);
        }
    }

    protected LinkedQueue<Integer> mergeQueues(LinkedQueue<Integer> queueA, LinkedQueue<Integer> queueB) {

        LinkedQueue<Integer> mergedQueue = new LinkedQueue<Integer>();

        while (!queueA.isEmpty() && !queueB.isEmpty()) {
            // checks the first elements and enqueue the lowest into mergedQueue
            if (queueA.first() <= queueB.first()) {
                mergedQueue.enqueue(queueA.dequeue());
            } else {
                mergedQueue.enqueue(queueB.dequeue());
            }
        }

        // if one queue is left with one or more elements, then
        // the remaining elements will be enqueue into the mergedQueue
        while (!queueA.isEmpty()) {
            mergedQueue.enqueue(queueA.dequeue());
        }

        while (!queueB.isEmpty()) {
            mergedQueue.enqueue(queueB.dequeue());
        }

        return mergedQueue;
    }
}
