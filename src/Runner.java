import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Runner extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anthill Java");
        frame.getContentPane().add(new Runner());
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void paint(Graphics g) {
        g.drawLine(10, 10, 1280, 720);
    }
}
