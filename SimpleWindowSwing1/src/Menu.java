import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.text.Style;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    public static final int width = 300;
    public static final int height = 300;

    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    public Menu(){
        super("Menu");
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,3));

        redPanel = new JPanel();
        //redPanel.setBackground(Color.red);
        add(redPanel);

        whitePanel = new JPanel();
       // whitePanel.setBackground(Color.WHITE);
        add(whitePanel);

        bluePanel = new JPanel();
        //bluePanel.setBackground(Color.BLUE);
        add(bluePanel);

        JLabel color = new JLabel("lala apa");

        JMenu menuMoja = new JMenu("Hapa");

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(this);
        menuMoja.add(redChoice);

        JMenuItem whiteChoice = new JMenu("White");
        whiteChoice.addActionListener(this);
        menuMoja.add(whiteChoice);

        JMenuItem blueChoice = new JMenu("Blue");
        blueChoice.addActionListener(this);
        menuMoja.add(blueChoice);

        JMenuBar bar = new JMenuBar();
        bar.add(menuMoja);
        setJMenuBar(bar);

    }

    public static void main(String args[]){
        Menu gui = new Menu();
        gui.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if(buttonString.equals("Red"))
            redPanel.setBackground(Color.RED);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if(bluePanel.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else
            System.out.println("Kuna ka error kametokea");
    }
}
