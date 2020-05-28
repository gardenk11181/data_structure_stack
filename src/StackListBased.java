import java.util.LinkedList;

public class StackListBased<T> implements StackInterface<T>{
    private LinkedList<T> list;

    public StackListBased() {
        list = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.size()==0;
    }

    @Override
    public void push(T newItem) {
        list.add(0,newItem);
    }

    @Override
    public T pop() {
        if(isEmpty()) {
            return null;
        } else {
            T item = list.get(0);
            list.remove(0);
            return item;
        }
    }

    @Override
    public void popAll() {
        list.clear();
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
}
