package patterson.anthill;

import patterson.anthill.util.Constants;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Runner extends JPanel {

    private Simulation simulation;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Anthill Java");
        Runner runner = new Runner();
        runner.setBackground(Color.BLACK);
        frame.setContentPane(runner);
        frame.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        runner.simulation = new Simulation();

        long endTime = System.nanoTime();
        while (true) {
            long deltaTime = Math.abs(System.nanoTime() - endTime);
            endTime = System.nanoTime();
            runner.simulation.update(deltaTime);
            runner.repaint();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        simulation.paint(g);
    }
}
