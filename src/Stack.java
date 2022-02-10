public class Stack {

    private int counter=0;
    private int element[] = new int[2];

    public boolean isEmpty() {
        return counter == 0 ;
    }

    public int push(int element) {
        this.element[counter++] = element;
        return 0;
    }

    public int pop() throws UnderFlow {
        if(isEmpty()) {
            throw new UnderFlow();
        }
        return element[--counter];
    }

    public class UnderFlow extends Exception {
    }
}
