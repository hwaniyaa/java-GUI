package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice07 extends JFrame {


  public Practice07() {
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    // 맨위 수식입력
    JPanel northPanel = new JPanel();
    northPanel.setLayout(new FlowLayout());
    northPanel.setBackground(Color.GRAY);
    northPanel.add(new JLabel("수식입력"));
    northPanel.add(new JTextField(16));

    // 중간
    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(4, 4, 5 ,5));
    for(int i=0; i<10; i++){
      JButton btn = new JButton(""+i); // 몇개 생성
      centerPanel.add(btn); //생성한거 출력
    }
    centerPanel.add(new JButton("CE"));
    centerPanel.add(new JButton("계산"));

    String[] marks = {"+", "-", "x", "/"}; 
    for(int i=0; i<marks.length; i++){
      JButton btn = new JButton(marks[i]);
      btn.setBackground(Color.green);
      centerPanel.add(btn);
    }


    // 맨아래 계산입력
    JPanel southPanel = new JPanel();
    southPanel.setLayout(new FlowLayout());
    southPanel.setBackground(Color.GRAY);
    southPanel.add(new JLabel("계산입력"));
    southPanel.add(new JTextField(16));

    contentPane.add(northPanel, BorderLayout.NORTH);
    contentPane.add(centerPanel, BorderLayout.CENTER);
    contentPane.add(southPanel, BorderLayout.SOUTH);

    setTitle("GRID Color");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Practice07();
  }
}
