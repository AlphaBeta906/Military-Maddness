import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Main
{
  
  Container con;
  JFrame window;

  public static void main(String[]args)
  {
    new Game ()
  }
      
  void Game(){
    window = new JFrame();
    widnow.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackround(Color.black);
    window.setLayout(null);
    window.setVisible(true);
    con = getContentPane();

  }

}
