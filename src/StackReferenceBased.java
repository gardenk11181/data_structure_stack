public class StackReferenceBased<T> implements StackInterface<T> {
    Node<T> top;

    public StackReferenceBased() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public void push(T newItem) {
        Node<T> node = new Node<>();
        node.setItem(newItem);
        node.setNextNode(top);
        top = node;
    }

    @Override
    public T pop() {
        if(top==null) return null;
        else {
            T item = top.getItem();
            top = top.getNextNode();
            return item;
        }
    }

    @Override
    public void popAll() {
        top = null;
    }

    @Override
    public T peek() {
        if(top==null) {
            return null;
        } else {
            return top.getItem();
        }
    }
}

class Node<T> {
    private Node<T> nextNode;
    private T item;

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
