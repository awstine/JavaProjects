import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundColorToggle extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JButton toggleButton = new JButton();
    Color currentColor;
    Color labelColor;

    public BackgroundColorToggle() {
        JFrame frame = new JFrame();
        frame.setTitle("Change Background Color Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        currentColor = Color.PINK;
        panel.setBackground(currentColor);

        label = new JLabel("Click the Button to Change Background Color");
        labelColor = Color.BLACK;
        label.setForeground(labelColor);
        panel.add(label, BorderLayout.BEFORE_FIRST_LINE);

        toggleButton = new JButton("Change Color");
        toggleButton.setFocusable(false);
        toggleButton.setPreferredSize(new Dimension(100, 50)); // Set width and height
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleBackgroundColor();
            }
        });
        panel.add(toggleButton, BorderLayout.SOUTH);

        frame.add(panel);
        pack();
    }

    private void toggleBackgroundColor() {
        if (currentColor == Color.PINK) {
            panel.setBackground(Color.BLACK);
            currentColor = Color.BLACK;
            labelColor = Color.WHITE;
            label.setForeground(labelColor);
        } else {
            panel.setBackground(Color.PINK);
            currentColor = Color.PINK;
            labelColor = Color.BLACK;
            label.setForeground(labelColor);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BackgroundColorToggle frame = new BackgroundColorToggle();
                frame.setVisible(true);
            }
        });
    }
}