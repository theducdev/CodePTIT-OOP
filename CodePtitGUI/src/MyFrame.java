import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new GridLayout(1,2));
        add(new JButton("Food to be place here"));

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JTextField("Time to be display here"), BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            p2.add(new JButton("" + i));
        }
        p2.add(new JButton("0"));
        p2.add(new JButton("Start"));
        p2.add(new JButton("Stop"));
        p1.add(p2);
        add(p1);
    }
}
