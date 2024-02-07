import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JFrame {
  public DisplayClock() {
    // Create an analog clock for the current time
    StillClock clock = new StillClock();

    // Display hour, minute, and hour in the message panel
    MessagePanel messagePanel = new MessagePanel((clock.getHour() +
      ":" + clock.getMinute() + ":" + clock.getSecond()));
    messagePanel.setForeground(Color.blue);
    messagePanel.setFont(new Font("Courie", Font.BOLD, 25));

    // Add the clock and message panel to the frame
    add(clock);
    add(messagePanel);
  }

  public static void main(String[] args) {
    DisplayClock frame = new DisplayClock();
    frame.setLayout(new GridLayout(2, 1));
    frame.setTitle("DisplayClock");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 350);
    frame.setVisible(true);
  }
}
