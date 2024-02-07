import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorFrame extends JFrame implements ItemListener {
    private JPanel p = new JPanel();
    private JComboBox <String> chon = new JComboBox<>();

    public ColorFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);

        JPanel ps = new JPanel();
        chon.addItem("Blue");
        chon.addItem("Red");
        chon.addItem("Green");
        chon.addItem("Black");
        chon.addItem("Yellow");
        chon.addItem("Pink");
        ps.add(chon);
        add(ps, BorderLayout.SOUTH);
        chon.addItemListener(this);


    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = chon.getSelectedItem().toString();
        if (s.equals("Blue")) p.setBackground(Color.BLUE);
        if (s.equals("Red")) p.setBackground(Color.RED);
        if (s.equals("Green")) p.setBackground(Color.GREEN);
        if (s.equals("Black")) p.setBackground(Color.BLACK);
        if (s.equals("Yellow")) p.setBackground(Color.YELLOW);
        if (s.equals("Pink")) p.setBackground(Color.PINK);

    }
}
