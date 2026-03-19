package Exercise2;

public class Exercise2 {

// Exercise 2 - This method can be found and implemented inside the Exercise2.LinkedStack.java class

//    public void transfer(Exercise2.LinkedStack<E> S, Exercise2.LinkedStack<E> T) {
//        // captures the size of the S stack
//        // that will be used for looping
//        int size = S.size();
//
//        // loops through the stack
//        for (int i = 0; i < size; i++) {
//            // captures the first element of stack S
//            var topElement = S.top();
//            // put the first element into the stack T
//            T.push(topElement);
//            // removes the first element from the stack S
//            S.pop();
//        }
//    }

    LinkedStack<Double> linkedStackS = new LinkedStack<>();
    LinkedStack<Double> linkedStackT = new LinkedStack<>();

    private void pushStack() {
        linkedStackS.push(1.1);
        linkedStackS.push(1.2);
        linkedStackS.push(1.3);
        linkedStackS.push(1.4);
        linkedStackS.push(1.5);
        linkedStackS.push(1.6);

        linkedStackT.push(9.51);
        linkedStackT.push(9.52);
        linkedStackT.push(9.53);
        linkedStackT.push(9.54);
        linkedStackT.push(9.55);
        System.out.println("\nItems pushed into stack.");
    }

    private void showStack() {
        try {
            int sizeS = linkedStackS.size();
            double numS = linkedStackS.top();
            System.out.println("\nExercise2.Stack S size: " + sizeS + "; Top: " + numS);
        }
        catch(Exception e) {
            System.out.println("Exercise2.Stack S is empty. " + e);
        }

        try {
            int sizeT = linkedStackT.size();
            double numT = linkedStackT.top();
            System.out.println("Exercise2.Stack T size: " + sizeT + "; Top: " + numT + "\n");
        }
        catch(Exception e) {
            System.out.println("Exercise2.Stack T is empty. " + e);
        }
    }

    public void transferStack() {
        pushStack();
        showStack();
        LinkedStack<Double> stack = new LinkedStack<>();
        stack.transfer(linkedStackS, linkedStackT);
        showStack();
    }
}
