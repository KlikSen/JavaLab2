package Task1;

public class Child extends Parent {

    public static int c = 10;

    public String name = "Child name";

    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child non-static block");
    }

    public Child() {
        System.out.println("CHILD : public static int a = " + a);
        System.out.println("CHILD : public static int b = " + b);
        System.out.println("CHILD : public static int c = " + c);
        System.out.println("CHILD : public String name = " + name);

    }
}
