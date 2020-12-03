import java.awt.Color;
import javax.swing.JFrame;

public class Main {
  
  JFrame window;
  
  public static void main(String[] args) {
    new Game();
  }
  
  void Game(){
    
    window = new JFrame();
    widnow.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setContentPane().setBackround(Color.black);
    window.setLayout(null);
    window.setVisible(true);
    
  }
  
}
