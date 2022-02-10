public class Stack {

    private boolean isEmpty = true;
    private int element;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int push(int element) {
        this.element = element;
        isEmpty = false;
        return 0;
    }

    public int pop() throws UnderFlow {
        if(isEmpty()){
            throw new UnderFlow();
        }
        return element;
    }

    public class UnderFlow extends Exception {
    }
}
