package co.edu.uniandes.graphics.gui;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

@SuppressWarnings("serial")
public class PanelLienzo extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // FIGURAS PRINCIPALES
        g2d.setColor(Color.GRAY);
        g2d.fill(new Rectangle2D.Double(0, 0, 400, 400));

        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(350, 30, 100, 100));
        g2d.fill(new Rectangle2D.Double(390, 130, 20, 40));

        g2d.fill(new RoundRectangle2D.Double(320, 170, 25, 180, 20, 20));
        g2d.fill(new RoundRectangle2D.Double(455, 170, 25, 180, 20, 20));

        g2d.fill(new Rectangle2D.Double(335, 170, 130, 40));

        g2d.setColor(Color.GRAY);
        g2d.fill(new RoundRectangle2D.Double(345, 200, 15, 40, 20, 20));
        g2d.fill(new RoundRectangle2D.Double(440, 200, 15, 40, 20, 20));

        g2d.setColor(Color.BLACK);
        g2d.fill(new Rectangle2D.Double(360, 170, 80, 180));
        g2d.fill(new RoundRectangle2D.Double(360, 330, 35, 180, 20, 20));
        g2d.fill(new RoundRectangle2D.Double(405, 330, 35, 180, 20, 20));

        int[] xPoints = {230, 250, 550, 570};
        int[] yPoints = {550, 500, 500, 550};
        g2d.setColor(Color.RED);
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);

        // RETO 1: FIGURA ADICIONAL
        g2d.setColor(Color.BLUE);
        g2d.fill(new Rectangle2D.Double(100, 500, 80, 50));
        g2d.setColor(Color.YELLOW);
        g2d.fill(new Ellipse2D.Double(120, 510, 40, 30));
        g2d.setColor(Color.GREEN);
        g2d.fill(new RoundRectangle2D.Double(90, 490, 100, 20, 10, 10));
        g2d.setColor(Color.MAGENTA);
        g2d.fill(new Polygon(new int[]{110, 140, 170}, new int[]{550, 520, 550}, 3));

        // RETO 2: FIGURA SIN CLASES 2D
        g.setColor(Color.ORANGE);
        g.fillRect(500, 100, 50, 50);
        g.setColor(Color.PINK);
        g.fillOval(510, 110, 30, 30);
        g.setColor(Color.CYAN);
        g.drawLine(500, 100, 550, 150);

        // RETO 3: ESTRELLA CRUZADA
        g2d.setColor(Color.YELLOW);
        int centerX = 350;
        int centerY = 350;
        int size = 200;

        for (int i = 0; i <= size; i += 5) {
            // Líneas desde el centro a las esquinas
            g2d.drawLine(centerX - i, centerY, centerX, centerY - i); // Izquierda a arriba
            g2d.drawLine(centerX + i, centerY, centerX, centerY - i); // Derecha a arriba
            g2d.drawLine(centerX - i, centerY, centerX, centerY + i); // Izquierda a abajo
            g2d.drawLine(centerX + i, centerY, centerX, centerY + i); // Derecha a abajo
        }
    }
}

