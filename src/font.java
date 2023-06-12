import java.awt.*;
public class font extends Frame{
    public font()
    {
       this.setVisible(true);
       this.setSize(700,700);
       this.setTitle("Font");
       Color c= new Color(0x009270);
       this.setBackground(c);
    }

    @Override
    public void paint(Graphics g) {
        Font fn =new Font("console",Font.BOLD,60);
        g.setFont(fn);
        g.setColor(Color.green);
        g.drawString("Font AWT",400,500);
    }

    public static void main(String[] args) {
        font f =new font();
    }
}
