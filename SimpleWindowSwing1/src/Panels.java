import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels extends JFrame implements ActionListener {

    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;

    public Panels(){
        //Super("") is the same as setTitle("");
        super("Panels");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Set bigger panel with what it contains
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,3));

        //Inserting the panels to spaces on the bigger panel
        redPanel = new JPanel();
        //redPanel.setBackground(Color.GREEN);
        biggerPanel.add(redPanel);

        whitePanel = new JPanel();
        //whitePanel.setBackground(Color.CYAN);
        biggerPanel.add(whitePanel);

        bluePanel = new JPanel();
        //bluePanel.setBackground(Color.red);
        biggerPanel.add(bluePanel);

        add(biggerPanel, BorderLayout.CENTER);

        //New Panel
        //Gray Pannel with buttons alighning to the right
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());

        //Add Button
        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.red);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanel.add(whiteButton);

        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        add(buttonPanel,BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Red"))
            redPanel.setBackground(Color.red);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if(buttonString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else
            System.out.println("Kuna ka Error kametokea");
    }

    public static void main(String args[]){
        Panels gui = new Panels();
        gui.setVisible(true);
    }
}
