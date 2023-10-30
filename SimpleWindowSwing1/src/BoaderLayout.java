import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;
import java.awt.BorderLayout;

public class BoaderLayout extends JFrame {

    public BoaderLayout(){
        super("Boader layout");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel label1 = new JLabel("1st label");
        add(label1, BorderLayout.NORTH);

        JLabel label2 = new JLabel("2nd label");
        add(label2, BorderLayout.CENTER);

        JLabel label3 = new JLabel("3rd label");
        add(label3, BorderLayout.SOUTH);
    }
}
