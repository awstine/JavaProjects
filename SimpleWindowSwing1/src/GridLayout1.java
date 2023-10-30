import javax.swing.*;
import java.awt.GridLayout;

public class GridLayout1 extends JFrame {


    public GridLayout1(int rows,int column){
        super();
        setSize(300,300);
        setTitle("Mambo na Grid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(rows, column));

        JLabel label1 = new JLabel("Monday");
        add(label1);

        JLabel label2 = new JLabel("Tuesday");
        add(label2);

        JLabel label3 = new JLabel("Wednesday");
        add(label3);

        JLabel label4 = new JLabel("Thursday");
        add(label4);

        JLabel label5 = new JLabel("Friday");
        add(label5);

    }


    public static void main(String args[]){

        GridLayout1 gui = new GridLayout1(0,5);
        gui.setVisible(true);

    }
}
