package Task1;

public class Grandparent {
    public static int a = 10;

    static {
        System.out.println("Grandparent static block");
    }

    {
        System.out.println("Grandparent non-static block");
    }

    public String name = "Grandparent name";

    public Grandparent() {
        System.out.println("GRANDPARENT : public static int a = " + a);
        System.out.println("GRANDPARENT : public String name = " + name);
    }
}
