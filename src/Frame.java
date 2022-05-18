import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

    static final int WIDTH = 700;
    static final int HEIGHT = 700;
    static final int STEPSIZE = 20;
    static final int LINEWEIGHT = 3;
    Panel p = new Panel();
    
    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(WIDTH,HEIGHT);
        this.getContentPane().add(p);
        pack();
        this.setVisible(true);
    }

    public void update() {
        this.p.update();
    }
    
}
