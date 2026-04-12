package Exercise1;

import java.util.Random;

/*

    I overloaded the constructor so that user can either provide
    a maximum number of key-value pair before resizing the map.
    I also modified the children classes to use the overloaded
    constructor.

    // These two constructors are implemented inside the AbstractHashMap class

    public AbstractHashMap(int cap, int p) {
        this(cap, p, 0);
    }

    public AbstractHashMap(int cap, int p, int maxLoad) {
        prime = p;
        capacity = cap;
        Random rand = new Random();
        scale = rand.nextInt(prime-1) + 1;
        shift = rand.nextInt(prime);
        createTable();
        maximumLoad = maxLoad;
    }

    // I modified the put(key, value) method to resize the hashmap according
    // to the user's provided maxLoad.

    public V put(K key, V value) {
        V answer = bucketPut(hashValue(key), key, value);
        if (maximumLoad == 0) {
            if (n > capacity / 2)              // keep load factor <= 0.5
                resize(2 * capacity - 1);        // (or find a nearby prime)
        } else {
            if (n > capacity * (maximumLoad/100.00)) {
                resize(2 * capacity - 1);
            }
        }
        return answer;
    }

    // I added and implemented this constructor inside the ProbeHashMap
    public ProbeHashMap(int cap, int p, int maxLoad) {super(cap, p, maxLoad);}
 */



public class Exercise1 {
    Random random = new Random();
    String[] fruits = {"apple", "banana", "cherry", "dates", "grapes"};

    public void startExercise1() {
        System.out.println("Exercise 1\n");

        ProbeHashMap<Integer, String> probeHashMap = new ProbeHashMap<Integer, String>(5, 3, 20);
        ChainHashMap<Integer, String> chainHashMap = new ChainHashMap<Integer, String>();

        System.out.println("ProbeHashMap initial size: " + probeHashMap.size());
        long probeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int fruitIndex = random.nextInt(5);
            probeHashMap.put(i + 1, fruits[fruitIndex]);
        }
        long probeEnd = System.nanoTime();

        System.out.println("ProbeHashMap created with elapsed time: " + (probeEnd - probeStart) + " nanosecond");
        System.out.println("ProbeHashMap final size: " + probeHashMap.size() + "\n");

        System.out.println("ChainHashMap initial size: " + chainHashMap.size());
        long chainStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int fruitIndex = random.nextInt(5);
            chainHashMap.put(i + 1, fruits[fruitIndex]);
        }
        long chainEnd = System.nanoTime();

        System.out.println("ChainHashMap created with elapsed time: " + (chainEnd - chainStart) + " nanosecond");
        System.out.println("ChainHashMap final size: " + chainHashMap.size() + "\n");
    }
}
