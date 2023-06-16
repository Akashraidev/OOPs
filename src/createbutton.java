import java.awt.*;

import static java.awt.Color.red;

public class createbutton extends Frame {
    public createbutton()
    {
        this.setBackground(Color.cyan);
        Button b =new Button("Click here");
        b.setBounds(5,1,50,22);
        add(b);
        this.setVisible(true);
        this.setSize(600,600);
        this.setTitle("create button");
    }
    public static void main(String[] args) {

        createbutton cb= new createbutton();
    }
}
