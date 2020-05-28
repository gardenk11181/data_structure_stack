public class StackArrayBased<T> implements StackInterface<T> {
    private final int MAX_STACK = 50;
    private T[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public StackArrayBased() {
        array = (T[]) new Object [MAX_STACK];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top<0;
    }

    public boolean isFull() {
        return top==(MAX_STACK-1);
    }

    @Override
    public void push(T newItem) {
        if(isFull()) {
            System.err.println("stack is full");;
        } else array[++top] = newItem;
    }

    @Override
    public T pop() {
        return array[top--];
    }

    @Override
    @SuppressWarnings("unchecked")
    public void popAll() {
        array = (T[]) new Object[MAX_STACK];
    }

    @Override
    public T peek() {
        if(top<0) {
            return null;
        } else {
            return array[top];
        }
    }
}
