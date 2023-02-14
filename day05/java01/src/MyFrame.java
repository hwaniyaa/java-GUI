
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
  public MyFrame() {
    // JFrame은 기본적으로 Container를 하나 들고 있음
    // Component는 Container에 포함되어야 한다.
    Container CP = getContentPane(); // 기본 컨테이너 생략 가능
    CP.setLayout(new FlowLayout());
    CP.add(new JButton("OK"));
    CP.add(new JButton("CANCEL"));
    CP.add(new JButton("IGNORE"));
    CP.add(new JButton("IGNORE"));
    CP.add(new JButton("IGNORE"));
    
    setTitle("300 x 300으로 스윙 프레임 만들기");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼
    setSize(300, 300);
    setVisible(true);
  }
  public static void main(String[] args) {
    new MyFrame();
  }
  
}