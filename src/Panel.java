import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    int maxWidth = (int) Math.floor(Frame.WIDTH/Frame.STEPSIZE);
    int maxHeight = (int) Math.floor(Frame.HEIGHT/Frame.STEPSIZE);
    Snake snake = new Snake();
    Apple apple = new Apple((int) Math.floor(Math.random()*Frame.STEPSIZE), (int) Math.floor(Math.random()*Frame.STEPSIZE));

    Panel() {
        this.setPreferredSize(new Dimension(Frame.WIDTH,Frame.HEIGHT));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fillRect(0,0,Frame.WIDTH,Frame.HEIGHT);

        snake.redraw(g2d);
    
        apple.redraw(g2d);

        g2d.setStroke(new BasicStroke(Frame.LINEWEIGHT));
        g2d.setColor(Color.darkGray);
        for (int i = 0; i <= Frame.WIDTH; i+=(Frame.WIDTH/Frame.STEPSIZE)) {
            g2d.drawLine(i, 0, i, Frame.HEIGHT);
        }
        for (int i = 0; i <= Frame.HEIGHT; i+=(Frame.HEIGHT/Frame.STEPSIZE)) {
            g2d.drawLine(0, i, Frame.WIDTH,i);
        }
    }

    public void update() {
        snake.move();
        snake.checkCol(apple);
        apple.update(snake);
        this.repaint();
        
    }

}
