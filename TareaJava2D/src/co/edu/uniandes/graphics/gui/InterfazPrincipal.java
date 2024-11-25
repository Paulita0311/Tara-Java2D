package co.edu.uniandes.graphics.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

@SuppressWarnings("serial")
public class InterfazPrincipal extends JFrame {

    public InterfazPrincipal() {
        setTitle("Tarea Java2D");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new PanelLienzo());
        setVisible(true); 
    }

    public static void main(String[] args) {
        new InterfazPrincipal();
    }
}

@SuppressWarnings("serial")
class PanelLienzo extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        //  figuras de prueba
        g2d.setColor(Color.GRAY);
        g2d.fill(new Rectangle2D.Double(0, 0, 400, 400)); // Rectángulo gris.

        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(350, 30, 100, 100)); // Elipse negra.
    }
}
