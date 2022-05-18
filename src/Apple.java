import java.awt.*;

public class Apple {

    Vector2 pos;

    Apple(int x, int y) {
        // this.pos = new Vector2((int) Math.floor(Math.random()*Frame.STEPSIZE), (int) Math.floor(Math.random()*Frame.STEPSIZE));
        this.pos = new Vector2(9, 1);
    }

    public void redraw(Graphics2D g2d) {
        g2d.setColor(Color.red);
        g2d.fillOval((int) pos.getX()*(Frame.WIDTH/Frame.STEPSIZE)+Frame.LINEWEIGHT, (int) pos.getY()*(Frame.HEIGHT/Frame.STEPSIZE)+Frame.LINEWEIGHT, (Frame.WIDTH/Frame.STEPSIZE)-Frame.LINEWEIGHT*2, (Frame.HEIGHT/Frame.STEPSIZE)-Frame.LINEWEIGHT*2);
    }

    public void update(Snake snake) {
        for (int i = 0; i < snake.bodySegs.size();i++) {
            if (this.pos.getX() == snake.bodySegs.get(i).pos.getX() && this.pos.getY() == snake.bodySegs.get(i).pos.getY()) {
                this.pos = new Vector2((int) Math.floor(Math.random()*Frame.STEPSIZE), (int) Math.floor(Math.random()*Frame.STEPSIZE));
            }
        }
    }
}