import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    int stepSize = 20; //number of steps for a given frame size.
    int lineWeight = 3;

    Panel() {
        this.setPreferredSize(new Dimension(700,700));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fillRect(0,0,Frame.WIDTH,Frame.HEIGHT);

        g2d.setColor(Color.GREEN);
        g2d.fillRect(0, 0, Frame.WIDTH/stepSize, Frame.HEIGHT/stepSize);

        g2d.setStroke(new BasicStroke(lineWeight));
        g2d.setColor(Color.darkGray);

        for (int i = 0; i <= Frame.WIDTH; i+=(Frame.WIDTH/stepSize)) {
            g2d.drawLine(i, 0, i, Frame.HEIGHT);
        }
        for (int i = 0; i <= Frame.HEIGHT; i+=(Frame.HEIGHT/stepSize)) {
            g2d.drawLine(0, i, Frame.WIDTH,i);
        }
        
        
        
    }

}
