import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

    static final int WIDTH = 700;
    static final int HEIGHT = 700;
    
    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(WIDTH,HEIGHT);
        
        Panel p = new Panel();
        this.getContentPane().add(p);
        pack();
        
        this.setVisible(true);
    }
    
}
