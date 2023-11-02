import javax.swing.*;

public class FirstWindow extends JFrame {

    public static final int height = 400;
    public static final int width = 400;

    public FirstWindow(){
        super();
        setSize(width,height);

        setTitle("First Window");

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JButton endButton = new JButton("Clicking ends the program");
       // EndingListener buttonEar = new EndingListener();
        endButton.addActionListener(new EndingListener());
        add(endButton);
    }
}