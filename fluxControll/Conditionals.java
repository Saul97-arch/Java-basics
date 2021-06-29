package fluxControll;

public class Conditionals {
    public static void main(String[] args) {
        int age = 13;

        if (age >= 75) {
            System.out.println("Ok boomer");
        } else if (age >= 18) {
            System.out.println("Let's have shrex...");
        } else if (age >= 13) {
            System.out.println("Fucking kidoo...");
        }
        else {
            System.out.println("You can't have shrexx... :(");
        }

        // There is switch case just for the sake

        String day = "friday";

        switch (day) {
            case "Sunday" -> System.out.println("Sunday my boy");
            default -> System.out.println("It is not meant to be!");
        }
    }
}
