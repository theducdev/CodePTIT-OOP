import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ColorFrame frame = new ColorFrame("Test Frame");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(
                MyFrame.EXIT_ON_CLOSE);

    }
}