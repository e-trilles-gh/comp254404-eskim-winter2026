package Exercise1;


/*
This method can be found and implemented inside the TreeMap.java class
in replacement for the treeSearch that uses recursion to search
for a key within the treeMap.

    private Position<Entry<K, V>> treeSearch(Position<Entry<K, V>> p, K key) {
        Position<Entry<K, V>> current = p;

        // continuously search the treemap until the position is found
        while (!isExternal(current)) {
            // compares the key with the current position's key element
            // using the compare method from DefaultComparator.java class
            int comp = compare(key, current.getElement());

            // updates the current's value after checking its element
            if (comp == 0) {
                return current;
            } else if (comp <0) {
                current = left(current);
            } else {
                current = right(current);
            }
        }

        return current;
    }
 */
public class Exercise1 {
    TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    public void runExercise1() {

        System.out.println("Exercise 1\n");

        createMap();

        findKey(11);
        findKey(19);

    }

    protected void createMap() {
        map.put(45, "cherry");
        map.put(18, "banana");
        map.put(31, "dates");
        map.put(9, "apple");
        map.put(84, "orange");
        map.put(11, "avocado");
        map.put(57, "grapes");

        System.out.println("Map created with " + map.size() + " elements\n");
    }

    protected void findKey(int key) {
        String value;
        value = map.get(key);
        if (value == null) {
            System.out.println("Key: " + key + " not found");
        } else {
            System.out.println("Key: " + key +  " found with value: " + value);
        }
    }
}
