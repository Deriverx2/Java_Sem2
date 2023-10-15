import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarAnimation extends Applet implements ActionListener, Runnable {
    private int x = 50; // Initial X-coordinate of the car
    private int y = 100; // Y-coordinate remains constant
    private int carSpeed = 5; // Initial speed of the car
    private boolean isMoving = false;
    private Thread carThread;

    private Button startButton, pauseButton, stopButton;

    public void init() {
        setSize(400, 200);
        setLayout(new FlowLayout());

        startButton = new Button("Start");
        startButton.addActionListener(this);
        add(startButton);

        pauseButton = new Button("Pause");
        pauseButton.addActionListener(this);
        add(pauseButton);

        stopButton = new Button("Stop");
        stopButton.addActionListener(this);
        add(stopButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startCar();
        } else if (e.getSource() == pauseButton) {
            pauseCar();
        } else if (e.getSource() == stopButton) {
            stopCar();
        }
    }

    private void startCar() {
        if (!isMoving) {
            isMoving = true;
            carThread = new Thread(this);
            carThread.start();
        }
    }

    private void pauseCar() {
        if (isMoving) {
            isMoving = false;
        }
    }

    private void stopCar() {
        if (isMoving) {
            isMoving = false;
            x = 50; // Reset the car's position
        }
    }

    public void run() {
        while (isMoving) {
            x += carSpeed;
            if (x > getWidth()) {
                x = -100; // Move the car back to the left when it goes off the screen
            }
            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillRect(x, y, 100, 50); // The car body
        g.setColor(Color.BLACK);
        g.fillOval(x + 10, y + 40, 30, 30); // Left wheel
        g.fillOval(x + 60, y + 40, 30, 30); // Right wheel
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Car Animation Applet");
        CarAnimation applet = new CarAnimation();

        frame.add(applet);
        frame.setSize(400, 200);
        frame.setVisible(true);
        applet.init();
    }
}
