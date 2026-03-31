package Exercise1;

public class Exercise1 {
    /*
    // This method can be found and implemented inside LinkedBinaryTree.java

    // This method captures the next position relative to the p

    Exercise 1 - preorderNext(p)

    public Position<E> preorderNext(Position<E> p) {
        if (left(p) != null) {
            return left(p);
        } else if (right(p) != null) {
            return right(p);
        } else {
            Position<E> parent = parent(p);
            while (true) {
                if (p == right(parent) || right(parent) == null) {
                    p = parent;
                    parent = parent(parent);
                } else {
                    return right(parent);
                }
            }
        }
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

    public void runExercise1() {
        System.out.println("Exercise 1\n");

        var p = jupiter;
        var pElement = p.getElement();
        var preorderNextP = binaryTree.preorderNext(p);
        var elementOfNextP = preorderNextP.getElement();
        System.out.println("The element of p is: " + pElement + "\nThe preorderNext(p) is : " + elementOfNextP);
    }
}
