package FirstClass.src;

import javax.swing.*;
import java.awt.*;

public class GUIprac2 extends JFrame {

    public static final int width = 300;
    public static final int height = 300;

    public GUIprac2() {
        super("SECOND GUI  APPLICATION");
        setSize(width,height);
        getContentPane().setBackground(Color.CYAN);
        setVisible(true);
    }

    public static void main(String args[]){
        new GUIprac2();
    }
}
