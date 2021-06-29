package swapVariables;

public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y = "juice";

        String aux;

        aux = x;
        x = y;
        y = aux;
        System.out.println(x);
        System.out.println(y);
    }
}
