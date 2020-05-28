public interface StackInterface<T> {
    public boolean isEmpty();
    public void push(T newItem);
    public T pop();
    public void popAll();
    public T peek();
}
