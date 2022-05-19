public class App {
    public static void main(String[] args) throws Exception {
        Frame f = new Frame();
        while(Frame.running) {
            Thread.sleep(100);
            f.update();
        }
    }
}
