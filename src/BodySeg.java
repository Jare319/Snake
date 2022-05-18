import java.awt.*;

public class BodySeg {
    
    Vector2 pos = new Vector2(-1,-1);

    BodySeg(Vector2 pos) {
        this.pos.set(pos);
    }

    public void redraw(Graphics2D g2d) {
        g2d.setColor(Color.green);
        g2d.fillRect((int) pos.getX()*(Frame.WIDTH/Frame.STEPSIZE), (int) pos.getY()*(Frame.HEIGHT/Frame.STEPSIZE), Frame.WIDTH/Frame.STEPSIZE, Frame.HEIGHT/Frame.STEPSIZE);
    }

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }
}
