import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Runner extends JPanel {

    private Simulation simulation;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Anthill Java");
        Runner runner = new Runner();
        frame.setContentPane(runner);
        frame.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        runner.simulation = new Simulation();

        while (true) {
            runner.simulation.update();
            runner.repaint();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        simulation.paint(g);
    }
}
