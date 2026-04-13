package Exercise2;

public class Exercise2 {
    LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();
    LinkedQueue<LinkedQueue<Integer>> queueOfQueues = new LinkedQueue<LinkedQueue<Integer>>();

    public void runExercise2() {
        System.out.println("Exercise 2\n");

        insertQueue();

        createSingleQueue(linkedQueue);

        while (queueOfQueues.size() > 1) {
            LinkedQueue<Integer> queueA = queueOfQueues.dequeue();
            LinkedQueue<Integer> queueB = queueOfQueues.dequeue();
            LinkedQueue<Integer> merged = mergeQueues(queueA, queueB);
            queueOfQueues.enqueue(merged);
        }

        LinkedQueue<Integer> mergedQueue = queueOfQueues.dequeue();

        for (int i = mergedQueue.size(); i > 0 ; i--) {
            System.out.println(mergedQueue.size() + " <- size; element removed -> " + mergedQueue.dequeue());
        }

        System.out.println(linkedQueue.size());
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

        System.out.println("Queue created with " + size + " elements.");
    }

    protected void createSingleQueue(LinkedQueue<Integer> queue) {
        while (!queue.isEmpty()) {
            LinkedQueue<Integer> singleQueue = new LinkedQueue<Integer>();
            singleQueue.enqueue(linkedQueue.dequeue());
            queueOfQueues.enqueue(singleQueue);
        }
    }

    protected LinkedQueue<Integer> mergeQueues(LinkedQueue<Integer> queueA, LinkedQueue<Integer> queueB) {

        LinkedQueue<Integer> mergedQueue = new LinkedQueue<Integer>();

        while (!queueA.isEmpty() && !queueB.isEmpty()) {

            if (queueA.first() <= queueB.first()) {
                mergedQueue.enqueue(queueA.dequeue());
            } else {
                mergedQueue.enqueue(queueB.dequeue());
            }
        }

        while (!queueA.isEmpty()) {
            mergedQueue.enqueue(queueA.dequeue());
        }

        while (!queueB.isEmpty()) {
            mergedQueue.enqueue(queueB.dequeue());
        }
        return mergedQueue;
    }
}
