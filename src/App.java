import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        Frame f = new Frame();
        while(true) {
            Thread.sleep(100);
            f.update();
        }
    }
}
