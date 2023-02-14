import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {

  public AnonymousClassListener() {
    Container ContainerPane = getContentPane();
    ContainerPane.setLayout(new FlowLayout());
    JButton btn = new JButton("Action");
    // 이벤트 발생 (버튼클릭)
    btn.addActionListener(new ActionListener(){ // MouseListener, ActionListener

      @Override
      public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        if(btn.getText().equals("Action")){
          btn.setText("액션");
          setTitle("액션 이벤트");
        } else {
          btn.setText("Action");
          setTitle("Action Event");
        }
      }

    });
    ContainerPane.add(btn);
    setTitle("Action Event");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new AnonymousClassListener();
  }
}
