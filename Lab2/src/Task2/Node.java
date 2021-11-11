package Task2;

public class Node<T> {
    private T value;
    private Node<T> prev;

    public Node() {
    }

    public Node(final T value, final Node<T> prev) {
        this.value = value;
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(final Node<T> prev) {
        this.prev = prev;
    }
}
