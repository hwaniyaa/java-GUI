import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
  public BorderLayoutEx(){
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout(20, 20));
    add(new JButton("add"), BorderLayout.NORTH);
    add(new JButton("sub"), BorderLayout.SOUTH);
    add(new JButton("mul"), BorderLayout.EAST);
    add(new JButton("div"), BorderLayout.WEST);
    add(new JButton("calc"), BorderLayout.CENTER);

    setTitle("BorderLayout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

    
  }

  public static void main(String[] args) {
    new BorderLayoutEx();
  }
}
