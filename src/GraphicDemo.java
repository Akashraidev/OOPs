import java.awt.*;
public class GraphicDemo extends Frame
{
    public GraphicDemo()
    {
//        Frame f =new Frame();
//        f.setVisible(true);
//        f.setTitle("Graphic");
//        f.setSize(300,300);

        this.setVisible(true);
        this.setTitle("Grahics");
        this.setSize(300,300);
        this.setBackground(Color.cyan);
    }

    @Override
    public void paint(Graphics g) {
       g.drawString("Welcome",60,60);
       g.drawRect(10,10,20,40);
       g.draw3DRect(80,80,40,40,true);
       g.drawOval(90,90,75,75);
    }

    public static void main(String[] args)
    {
        GraphicDemo g = new GraphicDemo();
    }
}
