package methods;

public class Methods {
    public static void main(String[] args) {
        // is block of code that is executed whenever is called upon
        String name = "Saul";
        hello(name);

        int x = 2;
        int y = 3;

        int z = add(x, y);

        System.out.println(z);
    }

    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static int add(int n1, int n2) {
        return n1 + n2;
    }
}
