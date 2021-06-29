package primitiveTypes;

public class Primitive {
    public static void main(String[] args) {
        // wrapper class = provides a way to use primitive data types as reference data Types
        // reference data types has useful methods
        // can be used with collections (ex.ArrayList)

        //primitive   //Wrapper
        //---------   //---------
        // boolean    Boolean
        // int        Integer
        // double     Double

        // autoboxing = the automatic conversion that compiler makes between  the primitive type and corresponding object wrapper class
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        // autoboxing, take more steps, more memory
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Saul";

        // unboxing --> The reference data type will be acting as a primitive
        if (a == true) {
            System.out.println("This is true");
        }
    }
}
