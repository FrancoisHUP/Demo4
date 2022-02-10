public class Stack {

    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int push(int element) {
        isEmpty = false;
        return 0;
    }
}
