package Practice;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Practice01 extends JFrame {


  public Practice01() {

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout(10, 10));
    add(new JButton("NORTH"), BorderLayout.NORTH);
    add(new JButton("WEST"), BorderLayout.WEST);
    add(new JButton("SOUTH"), BorderLayout.SOUTH);
    add(new JButton("EAST"), BorderLayout.EAST);
    add(new JButton("CENTER"), BorderLayout.CENTER);

    // super("Let's Study JAVA");
    setTitle("Let's Study JAVA");
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
