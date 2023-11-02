import javax.swing.*;
import java.awt.*;

public class ColouredWindow extends JFrame {

    //public static final int width = 300;
    //public static final int height = 300;

    public ColouredWindow(Color theColor){
        super("No change for color");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

       getContentPane().setBackground(theColor);

        JLabel aLabel = new JLabel("Close window button");
        add(aLabel);
    }

    public ColouredWindow(){
        this(Color.BLUE);
    }

}
