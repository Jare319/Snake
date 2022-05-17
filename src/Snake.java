import java.awt.*;

public class Snake {
    
    Vector2 pos = new Vector2(2, 1);
    Vector2 vel = new Vector2(1, 0);
    int length = 0;
    BodySeg[] bodySegs;

    Snake() {
        
    }

    public void Redraw(Graphics2D g2d) {
        g2d.setColor(Color.green);
        g2d.fillRect((int) pos.getX()*(Frame.WIDTH/Frame.STEPSIZE), (int) pos.getY()*(Frame.HEIGHT/Frame.STEPSIZE), Frame.WIDTH/Frame.STEPSIZE, Frame.HEIGHT/Frame.STEPSIZE);
    }

    public void Move() {
        pos.add(vel);
    }

}
