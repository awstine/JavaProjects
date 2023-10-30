import javax.swing.*;

public class Main {

    public static final int width = 400;
    public static final int height = 400;

    public static void main(String[] args) {
        JFrame firstWindow = new JFrame();
        firstWindow.setSize(width,height);

        firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton endButton = new JButton("Click to end program");
        EndingListener buttonEar = new EndingListener();
        endButton.addActionListener(buttonEar);

//        JButton startButton = new JButton("Click to end program");
//        EndingListener buttonEa = new EndingListener();
//        endButton.addActionListener(buttonEa);

        firstWindow.setTitle("title");
        firstWindow.add(endButton);
        //firstWindow.add(startButton);

        firstWindow.setVisible(true);
    }
}