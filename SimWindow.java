import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class SimWindow extends JComponent{
     int width;
    int height;
    // Defalut Constructor
    SimWindow(int w, int h)
    {   
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(50,75,100,250);
        g2d.setColor(new Color(100,149,237));
        g2d.fill(r);
    }
}
