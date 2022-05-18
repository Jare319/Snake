import java.awt.*;
import java.awt.event.*;
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
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                int keyCode = e.getKeyCode();
                p.snake.turn(keyCode);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

        });
        this.setVisible(true);
    }

    public void update() {
        this.p.update();
    }
    
}
