import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class GUI extends JFrame  {
        public GUI() {
            super("SECOND GUI  APPLICATION");
            setSize(400,300);
            getContentPane().setBackground(Color.CYAN);
            setLayout(new GridLayout(2,1));

            //Create panels
            JPanel panel1 = new JPanel();
            panel1.setLayout(new GridLayout(2,2));
            panel1.setBackground(Color.GREEN);

            JPanel panel2 = new JPanel();
            panel2.setLayout(new FlowLayout());
            panel2.setBackground(Color.BLUE);


            JLabel lblName = new JLabel("Name:");
            JLabel lblAdmNo = new JLabel("Adm No:");
            JTextField txtNAME = new JTextField();
            JTextField txtADMNO = new JTextField();

            panel1.add(lblName);
            panel1.add(lblAdmNo);
            panel1.add(txtNAME);
            panel1.add(txtADMNO);

            //Creating Button
            JButton btnDisplay = new JButton("Display");
            JButton btnClear = new JButton("Clear");
            JButton btnExit = new JButton("Exit");
            //Adding button to the panel
            panel2.add(btnDisplay);
            panel2.add(btnClear);
            panel2.add(btnExit);

            add(panel1);
            add(panel2);
            setVisible(true);

        }

        public static void main(String args[]){
            new GUI();
        }
    }