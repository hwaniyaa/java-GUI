import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {


  public FlowLayoutEx() {
    Container contentPane = getContentPane(); // 화면에 컨텐츠 생성
    add(new JButton("add"));
    add(new JButton("sub"));
    add(new JButton("mul"));
    add(new JButton("div"));
    add(new JButton("calc"));
    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30)); // 화면에 전부 보이게 하기
    
    // 기본화면 생성
    setTitle("FLOW LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);

  }
  

  public static void main(String[] args) {
    new FlowLayoutEx();  
  }
}
