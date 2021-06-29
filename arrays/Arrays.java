package arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Chevette", "Corvette", "Tesla"};

        // Access index of an array
        cars[0] = "Mustang";

        System.out.println(cars[0]);

        // Another way to create array
        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Blue";
        colors[2] = "Yellow";


        // 2D arrays

        String[][] cars2d = new String[3][3];
        cars2d[0][0] = "Camaro";
        cars2d[0][1] = "Corvette";
        cars2d[0][2] = "Silverado";

        cars2d[1][0] = "Mustang";
        cars2d[1][1] = "Ranger";
        cars2d[1][2] = "F-150";

        cars2d[2][0] = "Ferrari";
        cars2d[2][1] = "Lambo";
        cars2d[2][2] = "Tesla";

        // Another way to initialize an 2d array

        String[][] cars2d1 =
                {
                    {"Camaro", "Corvette", "Sivera"},
                    {"Mustang", "Ranger", "F1-150"},
                    {"Ferrari", "Lambo", "Tesla"}
                };

        for (int i = 0; i < cars2d.length; i++) {
            System.out.println();
            for (int j = 0; j < cars2d[i].length; j++) {
                System.out.print(cars2d[i][j] + " ");
            }
        }
    }
}
