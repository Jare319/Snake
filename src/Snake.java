import java.awt.*;
import java.util.ArrayList;

public class Snake {
    
    Vector2 pos = new Vector2(2, 1);
    Vector2 vel = new Vector2(1, 0);
    int length = 1;
    ArrayList<BodySeg> bodySegs = new ArrayList<BodySeg>(1);

    Snake() {
        bodySegs.add(new BodySeg(this.pos));
    }

    public void redraw(Graphics2D g2d) {
        for (int i = 0; i < bodySegs.size();i++) {
            bodySegs.get(i).redraw(g2d);
        }
    }

    public void move() {
        pos.add(vel);
        bodySegs.get(0).pos = this.pos;
        for (int i = 1; i < bodySegs.size();i++) {
            bodySegs.get(i).pos = bodySegs.get(i-1).pos;
        }
    }

    public void checkCol(Apple apple) {
        if (this.pos.equals(apple.pos)) {
            eat();
        }
    }

    public void eat() {
        length++;
        System.out.println(length);
        bodySegs.add(new BodySeg(bodySegs.get(bodySegs.size()-1).pos));
    }

    public void turn() {

    }

}
