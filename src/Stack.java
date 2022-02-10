public class Stack {

    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int push(int element) {
        isEmpty = false;
        return 0;
    }

    public void pop() throws UnderFlow {
        throw new UnderFlow();
    }

    public class UnderFlow extends Exception {
    }
}
