public class Exercise1 {

//    Exercise 1 - This method can be found and implemented inside LinkedPositionalList.java

//    public int indexOf(Position<E> p) {
//        // starts the counting from index 0
//        int index = 0;
//
//        // captures the size of the positionallinkedlist
//        int size = size();
//
//        // captures the first position of the positionallinkedlist
//        Position<E> walk = first();
//
//        // loops throughout the positionallinkedlist
//        for (int i = index; i < size; i++) {
//            // compares the two positions
//            if (p == walk) {
//                index = i;
//                break;
//            }
//            else {
//                walk = after(walk);
//            }
//        }
//        return index;
//    }

    LinkedPositionalList<String> positionalList = new LinkedPositionalList<>();

    Position<String> p1 = positionalList.addFirst("Apple");
    Position<String> p2 = positionalList.addFirst("Banana");
    Position<String> p3 = positionalList.addFirst("Cherry");
    Position<String> p4 = positionalList.addFirst("Dates");
    Position<String> p5 = positionalList.addFirst("Grapes");
    Position<String> p6 = positionalList.addFirst("Kiwi");
    Position<String> p7 = positionalList.addFirst("Lemon");
    Position<String> p8 = positionalList.addFirst("Mango");

    public void identifyPosition(){
        int indexPosition;
        System.out.println("Exercise 1");
        System.out.println("Positions added.\n");
        indexPosition = positionalList.indexOf(p4);

        System.out.println("The index of position p4 is: " + indexPosition + "\n");
    }
}
