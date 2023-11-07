import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame implements ActionListener {

    private JPanel blackPanel;
    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel greenPanel;

    public Example(){
        //Super("") is the same as setTitle("");
        super("Panels");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Set bigger panel with what it contains
        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,3));

        //Inserting the panels to spaces on the bigger panel
        blackPanel = new JPanel();
        //redPanel.setBackground(Color.GREEN);
        biggerPanel.add(blackPanel);

        redPanel = new JPanel();
        //whitePanel.setBackground(Color.CYAN);
        biggerPanel.add(redPanel);

        whitePanel = new JPanel();
        //bluePanel.setBackground(Color.red);
        biggerPanel.add(whitePanel);

        greenPanel = new JPanel();
        //bluePanel.setBackground(Color.red);
        biggerPanel.add(greenPanel);

        add(biggerPanel, BorderLayout.CENTER);

        //New Panel
        //Gray Pannel with buttons alighning to the right
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());

        //Add Button
        JButton blackButton = new JButton("Black");
        blackButton.setBackground(Color.black);
        blackButton.addActionListener(this);
        buttonPanel.add(blackButton);

        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.red);
        redButton.addActionListener(this);
        redButton.add(redButton);

        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.white);
        whiteButton.addActionListener(this);
        whiteButton.add(whiteButton);

        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.green);
        greenButton.addActionListener(this);
        greenButton.add(greenButton);

        add(buttonPanel,BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonString = e.getActionCommand();

        if (buttonString.equals("Black"))
            redPanel.setBackground(Color.black);
        else if(buttonString.equals("Red"))
            redPanel.setBackground(Color.red);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if(buttonString.equals("Green"))
            greenPanel.setBackground(Color.green);
        else
            System.out.println("Kuna ka Error kametokea");
    }

    public static void main(String args[]){
        Panels gui = new Panels();
        gui.setVisible(true);
    }
}
