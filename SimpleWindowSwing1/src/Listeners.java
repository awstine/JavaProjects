import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners extends JFrame {
    public static final int width = 600;
    public static final int height = 600;
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    public Listeners(){
        super("Action Listeners Demo");
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,3));
        setLayout(new FlowLayout());

        redPanel = new JPanel();
        //redPanel.setBackground(Color.black);
        add(redPanel);

        whitePanel = new JPanel();
        //whitePanel.setBackground(Color.red);
        add(whitePanel);

        bluePanel = new JPanel();
        //bluePanel.setBackground(Color.green);
        add(bluePanel);

        JMenu colourMenu = new JMenu("Add colors");

        JMenuItem redChoice = new JMenuItem("Red");
        redChoice.addActionListener(new RedListener());
        colourMenu.add(redChoice);

        JMenuItem whiteChoice = new JMenuItem("White");
        whiteChoice.addActionListener(new WhiteListener());
        colourMenu.add(whiteChoice);

        JMenuItem blueChoice = new JMenuItem("Blue");
        blueChoice.addActionListener(new BlueListener());
        colourMenu.add(blueChoice);

        JMenuItem clearChoice = new JMenuItem("Clear");
        clearChoice.addActionListener(new ClearListener());
        colourMenu.add(clearChoice);

        JMenuBar bar = new JMenuBar();
        bar.add(colourMenu);
        setJMenuBar(bar);
    }


    //Listeners inner class
    private class RedListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            redPanel.setBackground(Color.RED);
        }
    }
    private class WhiteListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            whitePanel.setBackground(Color.white);
        }
    }
    private class BlueListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            bluePanel.setBackground(Color.blue);
        }
    }
    private class ClearListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            redPanel.setBackground(null);
            whitePanel.setBackground(null);
            bluePanel.setBackground(null);
        }
    }


    public static void main(String args []){
        Listeners gui = new Listeners();
        gui.setVisible(true);
    }

}
