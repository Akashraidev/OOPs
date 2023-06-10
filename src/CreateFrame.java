//Create Frame
// By using Frame object
import java.awt.*;
public class CreateFrame {
    public static void main(String[] args) {
        Frame f = new Frame();
        //Default setting of frame

        // now frame will be visible, by default it is not visible
        f.setVisible(true);

        // Frame size by default it is zero zero
        f.setSize(300,400);

        // setting the title of Frame
        f.setTitle("My frame");
        f.setBackground(Color.pink);
    }
}
