import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    Snake snake = new Snake();

    Panel() {
        this.setPreferredSize(new Dimension(Frame.WIDTH,Frame.HEIGHT));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fillRect(0,0,Frame.WIDTH,Frame.HEIGHT);

        snake.Move();
        snake.Redraw(g2d);

        g2d.setStroke(new BasicStroke(Frame.LINEWEIGHT));
        g2d.setColor(Color.darkGray);

        for (int i = 0; i <= Frame.WIDTH; i+=(Frame.WIDTH/Frame.STEPSIZE)) {
            g2d.drawLine(i, 0, i, Frame.HEIGHT);
        }
        for (int i = 0; i <= Frame.HEIGHT; i+=(Frame.HEIGHT/Frame.STEPSIZE)) {
            g2d.drawLine(0, i, Frame.WIDTH,i);
        }
        
        
        
    }

}
