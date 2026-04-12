package Exercise2;

/*
This method can be found and implemented inside the SortedTableMap class

public boolean containsKey(K key) {
    boolean isValue = false;

    // getting the index of key from the map
    int keyIndex = findIndex(key);

    // checks the index and its key if both are valid
    if (keyIndex < size() && compare(key, table.get(keyIndex)) == 0) {
        isValue = true;
    }

    return isValue;
}
*/

public class Exercise2 {
    SortedTableMap<String, Integer> sortedTableMap = new SortedTableMap<String, Integer>();

    public void startExercise2() {

        String[] keys = {"potato", "tomato"};

        System.out.println("Exercise 2\n");

        sortedTableMap.put("apple", 12);
        sortedTableMap.put("banana", 3);
        sortedTableMap.put("orange", 43);
        sortedTableMap.put("grapes", 98);
        sortedTableMap.put("dates", 6);

        System.out.println("non-null Key-Value pairs added to the sortedTableMap.\n");

        sortedTableMap.put(keys[0], null);

        System.out.println(keys[0] + " key with 'null' value added.\n");

        System.out.println();

        // iterates through the list of keys
        for (int i = 0; i < keys.length; i++) {
            if (sortedTableMap.containsKey(keys[i])){
                System.out.println("The key " + keys[i] + " is found inside sortedTableMap");
            } else {
                System.out.println("The key " + keys[i] + " is not part of sortedTableMap");
            }
        }
    }
}
