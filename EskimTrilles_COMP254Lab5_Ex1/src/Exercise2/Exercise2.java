package Exercise2;

public class Exercise2 {

    /*

    // This method can be found and implemented inside the LinkedListTree.java

    // This method calculates and prints the height of p. the height
    // is based on the max height of children + 1. Basically calculates the distance
    // of p from its deepest/lowest leaf.

    public int computeHeight(Position<E> p) {
        int height;

        // returns 0 if the p do not have children
        if (numChildren(p) == 0) {
            height = 0;
        } else {
            int maxChildHeight = 0;

            // recursively calling the method to calculate
            // height of the children
            for(Position<E> child : children(p)) {

                int childHeight = computeHeight(child);

                // captures the max height of the children
                if (maxChildHeight < childHeight) {
                    maxChildHeight = childHeight;
                }
            }

            // updates the height of p according to the
            // maximum height captured from the children
            height = 1 + maxChildHeight;
        }
        System.out.println(p.getElement());
        return height;
    }
     */

    LinkedBinaryTree binaryTree = new LinkedBinaryTree();
    Position<String> root = binaryTree.addRoot("Solar System");
    Position<String> planetPosition = binaryTree.addLeft(root, "Planet");
    Position<String> satellitePosition = binaryTree.addRight(root, "Satellite");
    Position<String> nearFromSun = binaryTree.addLeft(planetPosition, "Near from Sun");
    Position<String> farFromSun = binaryTree.addRight(planetPosition, "Far from Sun");
    Position<String> manMade = binaryTree.addLeft(satellitePosition, "Man-made satellite");
    Position<String> natural = binaryTree.addRight(satellitePosition, "Natural satellite");
    Position<String> mars = binaryTree.addLeft(nearFromSun, "Mars");
    Position<String> earth = binaryTree.addRight(nearFromSun, "Earth");
    Position<String> jupiter = binaryTree.addLeft(farFromSun, "Jupiter");
    Position<String> saturn = binaryTree.addRight(farFromSun, "Saturn");

    public void runExercise2() {
        System.out.println("Exercise 2\n");
        Position<String> p = planetPosition;

        System.out.println("\nExercise2 result: ");
        System.out.println("Element: " + p.getElement() + " - Height: " + binaryTree.computeHeight(p));
    }
}
