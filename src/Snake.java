import java.awt.*;
import java.util.ArrayList;

public class Snake {
    
    Vector2 pos = new Vector2(0, 1);
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
        for (int i = bodySegs.size()-1; i > 0;i--) {
            bodySegs.get(i).pos.set(bodySegs.get(i-1).pos);
        }
        pos.add(vel);
        bodySegs.get(0).pos = this.pos;
        
    }

    public void checkCol(Apple apple) {
        if (this.pos.equals(apple.pos)) { //Apple collisions
            eat();
        }
        if (this.pos.getX() == Frame.STEPSIZE || this.pos.getX() < 0 || this.pos.getY() < 0 || this.pos.getY() == Frame.STEPSIZE) { //Wall collisions
            Frame.gameOver();
        }
        for (int i = 2; i < bodySegs.size();i++) {   //Self collisions
            if (this.pos.equals(bodySegs.get(i).pos)) {
                Frame.gameOver();
            }
        }
    }

    public void eat() {
        length++;
        bodySegs.add(new BodySeg(bodySegs.get(bodySegs.size()-1).pos));
    }

    public void turn(int key) {
        switch (key) {
            case 37: this.vel.set(-1, 0);
                break;
            case 38: this.vel.set(0, -1);
                break;
            case 39: this.vel.set(1, 0);
                break;
            case 40: this.vel.set(0, 1);
                break;
            default:
                break;
        }

    }

}
