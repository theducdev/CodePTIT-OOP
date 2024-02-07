import javax.swing.*;
import java.awt.*;

public class MessagePanel extends JPanel {
    private String message;

    public MessagePanel(String message) {
        this.message = message;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(message, getWidth()/2 - 45 , getHeight()/2);
    }

    public void setMessage(String message) {
        this.message = message;
        repaint();
    }


}
