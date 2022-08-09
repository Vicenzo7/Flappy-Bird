package flappyBird;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlappyBird implements ActionListener {

    //instance of class FlappyBird
    public static FlappyBird flappyBird;

    public final int WIDTH = 600, HEIGHT = 600;

    public Renderer renderer;

    public Rectangle bird;

    public FlappyBird() {
        //Frame Creation
        JFrame jFrame = new JFrame();
        Timer timer = new Timer(20, this);


        renderer = new Renderer();

        jFrame.add(renderer);
        jFrame.setTitle("Flappy Bird");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(WIDTH, HEIGHT);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();
    }

    public void repaint(Graphics g) {

        // setting background color
        g.setColor(Color.cyan);
        g.fillRect(0,0,WIDTH,HEIGHT);

        // bottom border graphic
        g.setColor(Color.orange);
        g.fillRect(0,HEIGHT-120,WIDTH,120);
        g.setColor(Color.green);
        g.fillRect(0,HEIGHT-120,WIDTH,20);

        //setting the bird graphics
        g.setColor(Color.red);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);

    }

    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }


}
