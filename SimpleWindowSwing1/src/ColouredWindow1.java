import java.awt.*;

public class ColouredWindow1 {
    public static void main (String args[]){
        ColouredWindow w1 = new ColouredWindow();
        w1.setVisible(true);

        ColouredWindow w2 = new ColouredWindow(Color.CYAN);
        w2.setVisible(true);
    }
}
