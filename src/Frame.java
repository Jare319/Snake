import java.awt.*;
import javax.swing.*;

public class Frame {

    static final int WIDTH = 700;
    static final int HEIGHT = 700;
    
    Frame() {
        JFrame f = new JFrame("My First GUI");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(WIDTH,HEIGHT);
        
        Panel p = new Panel();
        p.setSize(WIDTH, HEIGHT);
        f.getContentPane().add(p);
        f.getContentPane().setBackground(Color.BLACK);
        f.setVisible(true);
    }
    
}
