import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel{

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, this.getWidth()/20, this.getHeight()/20);
        
    }

}
