import java.awt.*;
public class Extendingframe extends Frame {
    Extendingframe() //construtor
    {
      this.setVisible(true);
      this.setSize(400,500);
      this.setTitle("Create Frame by extending Frame class");
    }

    public static void main(String[] args) {
        Extendingframe f = new Extendingframe();
    }
}
