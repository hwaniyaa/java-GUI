package Practice;

import java.awt.*;
import javax.swing.*;

public class Practic08 extends JFrame {


  public Practic08() {

    Container contentPane = getContentPane();

    // NORTH
    JPanel topJPanel = new JPanel();
      topJPanel.setLayout(new FlowLayout());
      topJPanel.setBackground(Color.gray);
      topJPanel.add(new JButton("열기"));
      topJPanel.add(new JButton("닫기"));
      topJPanel.add(new JButton("나가기"));

    // CENTER
    JPanel centerJPanel = new JPanel();
      centerJPanel.setLayout(null);
      JLabel [] btnL = new JLabel[9];
      for(int i=0; i<btnL.length; i++){
          int x = (int)(Math.random()*200+50);
          int y = (int)(Math.random()*300+50);
          btnL[i] = new JLabel("*");
          btnL[i].setLocation(x, y);
          btnL[i].setForeground(Color.RED);
          btnL[i].setSize(10,10);
          centerJPanel.add(btnL[i]);
        }

    // SOUTH
    JPanel buttonJPanel = new JPanel();
      buttonJPanel.setLayout(new FlowLayout());
      buttonJPanel.setBackground(Color.YELLOW);
      buttonJPanel.add(new JButton("Word Input"));
      buttonJPanel.add(new JTextField(15));

    contentPane.add(topJPanel, BorderLayout.NORTH);
    contentPane.add(centerJPanel, BorderLayout.CENTER);
    contentPane.add(buttonJPanel, BorderLayout.SOUTH);
    

    setTitle("여러 개의 패널을 가진 프레임");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 500);
    setVisible(true);
  }


  public static void main(String[] args) {
    new Practic08();
  }
}
