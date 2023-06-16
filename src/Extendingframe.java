import java.awt.*;
public class Extendingframe extends Frame {
    Extendingframe() //construtor
    {
      this.setVisible(true);
      this.setSize(400,500);
      this.setTitle(" Frame by extending Frame Class");
    }

    public static void main(String[] args) {
        Extendingframe f = new Extendingframe();
    }
}
