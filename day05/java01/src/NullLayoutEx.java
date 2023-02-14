
import java.awt.*;
import javax.swing.*;

public class NullLayoutEx extends JFrame {

  public NullLayoutEx() {
    Container contentPane = getContentPane();
    contentPane.setLayout(null);
    JLabel label = new JLabel("Hollo");
    label.setBounds(100, 100, 200, 200); // x,y로 위치 이동
    add(label);
    for(int i=0; i<10; i++){
      JButton button = new JButton(Integer.toString(i));
      button.setLocation(200, i * 20 + 50);
      button.setSize(50, 15);
      add(button);
    }

    setTitle("GRID LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new NullLayoutEx();
  }
}
