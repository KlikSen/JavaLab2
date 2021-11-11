package Task2;

public class Main {
    public static void main(final String[] args) {

        final Stack<Integer> stack = new DemoStack<>();

        stack.push(7);
        stack.push(600);
        stack.push(-98);
        stack.push(3);

        stack.read();

        final int size = stack.size();
        for (int i = 0; i < size; i++)
        System.out.println(stack.pop());
    }
}
