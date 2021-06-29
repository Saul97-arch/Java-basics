package overloadMethods;

public class Overload {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        int a = add(1, 2);
        int b = add(1, 2, 3);
        int c = add(1, 2, 3, 4);
    }

    static int add(int a, int b) {
        return  a + b;
    }

    static int add(int a, int b, int c) {
        return  a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return  a + b + c + d;
    }
    // Not just the amount of parameters but the type counts too
    static double add(double a, double b) {
        return  a + b;
    }

    static double add(double a, double b, double c) {
        return  a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return  a + b + c + d;
    }
}
