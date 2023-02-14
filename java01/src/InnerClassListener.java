import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class InnerClassListener extends JFrame {

  // 이벤트 보낼 클래스
class MyActionListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("버튼이 이벤트를 받을 수 있습니다.");
    // 이벤트를 받는 버튼을 받음
    JButton btn = (JButton)e.getSource();
    // System.out.println(btn.getText());
    if(btn.getText().equals("Action")){
      btn.setText("액션");
    } else {
      btn.setText("Action");
    }
    InnerClassListener.this.setTitle("액션 이벤트");
  }
}

  public InnerClassListener() {
    Container ContainerPane = getContentPane();
    ContainerPane.setLayout(new FlowLayout());
    JButton btn = new JButton("Action");
    // 이벤트 발생 (버튼클릭)
    btn.addActionListener(new MyActionListener());
    ContainerPane.add(btn);
    
    setTitle("Action Event");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new InnerClassListener();
  }
}
