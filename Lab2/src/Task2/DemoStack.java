package Task2;

public class DemoStack<T> implements Stack<T> {
    protected Node<T> head;

    public DemoStack() {}

    @Override
    public int size(){
        int size = 0;

        if (head == null){
            return size;
        }

        Node<T> headPointer = head;

        while (headPointer != null){
            ++size;
            headPointer = headPointer.getPrev();
        }

        return size;
    }


    @Override
    public void push(final T value) {
        final Node<T> newNode = new Node(value, this.head);

        this.head = newNode;
    }

    @Override
    public T pop() {
        if (head == null){
            return null;
        }

        final Node<T> headPointer = head;

        this.head = headPointer.getPrev();
        return (T) headPointer.getValue();
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public void read(){
        if (head == null){
            System.out.println("This stack is empty");
        }

        Node<T> headPointer = head;
        while (headPointer != null){
            System.out.print(headPointer.getValue() + "  ");
            headPointer = headPointer.getPrev();
        }
        System.out.println();
    }
}
