public class Stack {

    private int counter=0;
    private int element;

    public boolean isEmpty() {
        return counter == 0 ;
    }

    public int push(int element) {
        this.element = element;
        counter++;
        return 0;
    }

    public int pop() throws UnderFlow {
        if(isEmpty()){
            throw new UnderFlow();
        }
        --counter;
        return element;
    }

    public class UnderFlow extends Exception {
    }
}
