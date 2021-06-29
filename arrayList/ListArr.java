package arrayList;

import java.util.ArrayList;

public class ListArr {
    public static void main(String[] args) {
        // <ArrayList> = a resizable array;
        // Elements can be added and removed after compilation phase
        // store only reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("Hamburguer");
        food.add("Hotdog");

        food.set(0, "Sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // 2D array list
        // Change the size of the list during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("soda");
        drinkList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1));
    }
}
