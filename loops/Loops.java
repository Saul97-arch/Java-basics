package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // While loop

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name:");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // for loop

        for (int i = 0; i <=10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >=0; i--) {
            System.out.println(i);
        }
    }
}
