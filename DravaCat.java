import javax.swing.*;
import java.awt.*;

public class DravaCat extends JFrame {

    public DravaCat() {
        setTitle("ЭТА КИТКАТ ИЛИ КОТ");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new CatPanel());
    }

    class CatPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.magenta);
            g2d.fillOval(100, 150, 200, 100); // Тіло (овал)

            g2d.fillOval(150, 80, 100, 100); // Голова (коло)

            int[] xPoints = {160, 180, 140};
            int[] yPoints = {90, 50, 70};
            g2d.fillPolygon(xPoints, yPoints, 3); // Ліве вухо
            int[] xPoints2 = {240, 260, 280};
            int[] yPoints2 = {50, 70, 90};
            g2d.fillPolygon(xPoints2, yPoints2, 3); // Праве вухо

            g2d.setColor(Color.ORANGE);
            g2d.fillOval(170, 110, 20, 20); // Ліве око
            g2d.fillOval(210, 110, 20, 20); // Праве око
            g2d.setColor(Color.BLACK);
            g2d.fillOval(175, 115, 10, 10); // Зіниця лівого ока
            g2d.fillOval(215, 115, 10, 10); // Зіниця правого ока

            g2d.setColor(Color.CYAN);
            g2d.fillOval(190, 140, 20, 10); // Ніс

            g2d.setColor(Color.BLACK);
            g2d.drawArc(180, 140, 40, 20, 200, 140); // Рот

            g2d.setColor(Color.YELLOW);
            g2d.fillOval(120, 230, 40, 60); // Ліва лапа
            g2d.fillOval(240, 230, 40, 60); // Права лапа

            g2d.setStroke(new BasicStroke(10));
            g2d.drawArc(250, 120, 100, 50, 0, 180);
        }
    }
}