package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice05 extends JFrame{


  public Practice05() {
    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(4, 4));

    JButton btns[] = new JButton[16];


    for(int i=0; i<16; i++){
      
      btns[i] = new JButton(""+(i+1));
      int r = (int) (Math.random() * 256);
      int g = (int) (Math.random() * 256);
      int b = (int) (Math.random() * 256);
      btns[i].setBackground(new Color(r,g,b)); // 백그라운드 색상
      btns[i].setForeground(Color.RED); //폰트색상
      contentPane.add(btns[i]);
    }


    setTitle("GRID Color");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);

  }

  
  public static void main(String[] args) {
    new Practice05();
  }
}
