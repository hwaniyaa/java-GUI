package Practice;

import java.awt.*;
import javax.swing.*;

public class Practice02 extends JFrame {


  public Practice02() {

    Container contentPane = getContentPane();
    contentPane.setLayout(new GridLayout(1, 1));
    
    JButton btn[] = new JButton[10];
    for(int i=0; i<10; i++){
      btn[i] = new JButton(""+(i+1));

    }

    setTitle("GRID LAYOUT");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 200);
    setVisible(true);
  }


  public static void main(String[] args) {
    new Practice02();
  }
}
