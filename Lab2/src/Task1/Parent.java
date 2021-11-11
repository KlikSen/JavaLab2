package Task1;

public class Parent extends Grandparent {

    public static int b = 10;

    static {
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent non-static block");
    }

    public String name = "Parent name";

    public Parent() {
        System.out.println("PARENT : public static int a = " + a);
        System.out.println("PARENT : public static int b = " + b);
        System.out.println("PARENT : public String name = " + name);

    }
}
