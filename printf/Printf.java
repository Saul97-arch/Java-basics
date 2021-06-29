package printf;

public class Printf {
    public static void main(String[] args) {
        // printf() = an optional method to control, format, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //           % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a number %d", 123);

        boolean myBoolean = true;
        char myChar = 'S';
        String myString = "Saulo";
        double myDoubble = 3.41;

        System.out.printf("%b\n", myBoolean);
        System.out.printf("%s\n", myString);
        System.out.printf("%c\n", myChar);
        // precision
        System.out.printf("%.1f\n", myDoubble);

        // width
        // minimum of characters to be written as output
        // System.out.printf("Hello %10s", myString);
    }
}
