public class Stack {

    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int push(int element) {
        isEmpty = false;
        return 0;
    }

    public int pop() throws UnderFlow {
        if(isEmpty()){
            throw new UnderFlow();
        }
        return 0;
    }

    public class UnderFlow extends Exception {
    }
}
