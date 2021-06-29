package forEachLoop;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // for-each = traversing technique to iterate through the elements in array/collection
        // less steps, more readable
        // less flexible

        String[] animals = {"cat", "dog", "rat", "bird"};

        for (String i: animals) {
            System.out.println(i);
        }

        ArrayList<String> animals2 = new ArrayList<String>();
        animals2.add("Coyotte");
        animals2.add("Hienna");
        animals2.add("Cachorro");

        for (String i: animals2) {
            System.out.println(i);
        }
    }
}
