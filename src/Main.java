import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Sick pop-up");
        f.setSize(500,500);

        JLabel lb = new JLabel();
        lb.setText("You are an idiot...!");
        lb.setSize(500,100);
        lb.setFont(new Font("Serif", Font.BOLD, 40));
        lb.setVerticalAlignment(JLabel.TOP);
        lb.setHorizontalAlignment(JLabel.CENTER);

        JButton b1 = new JButton("Yes!");
        b1.setBounds(100,100,95,25);
        JButton b2 = new JButton("No...");
        b2.setFocusable(false);
        int x = 300;
        int y = 100;
        b2.setBounds(x,y,95,25);
        b1.addActionListener(e -> {
            lb.setText("I knew it....X3");
            f.remove(b2);
            Timer timer = new Timer(2000, evt -> {
                System.exit(0); // Terminate the program
            });
            timer.setRepeats(false);
            timer.start();
        });
        b2.addActionListener(e -> {
            int min = 150;
            int max = 400;
            Random random = new Random();
            int xn = random.nextInt(max - min) + min;
            int yn = random.nextInt(max - min) + min;
            b2.setBounds(xn, yn,95,25);
        });

        f.add(lb);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
