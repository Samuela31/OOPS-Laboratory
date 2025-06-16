import java.applet.Applet;
import java.awt.Graphics;

public class Message extends Applet {
    public void paint(Graphics g) {
        g.drawString("Simple message", 100, 100);
    }
    
    public static void main(String[] args) {
        // Instantiate the Message applet and run it
        Message message = new Message();
        message.init();
        message.start();
    }
}
