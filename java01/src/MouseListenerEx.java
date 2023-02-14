import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class MouseListenerEx extends JFrame {

  JLabel label = new JLabel("hello");

  public MouseListenerEx() {
    Container ContainerPane = getContentPane();
    ContainerPane.setLayout(null);
    label.setLocation(100, 100);
    label.setSize(50,20);
    ContainerPane.add(label);
    ContainerPane.addMouseListener(new MouseListener(){

      @Override
      public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }

      @Override
      public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setLocation(x, y);
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }

      @Override
      public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }

    });
    
    setTitle("Mouse Event 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new MouseListenerEx();
  }
}
