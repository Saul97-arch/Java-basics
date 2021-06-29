package guiApp;
import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Whats your age?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Whats your height?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
    }
}
