import javax.swing.*;
import java.awt.*;

public class face2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 50, 350, 500);  // Face outline
        g.drawOval(200, 150, 70, 70);   // Left eye
        g.drawOval(330, 150, 70, 70);   // Right eye
        g.drawLine(300, 250, 300, 350); // Nose as a single line
        g.drawArc(220, 400, 150, 70, 0, -180);  // Mouth
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new face2());
        frame.setSize(600, 700);
        frame.setVisible(true);
    }
}