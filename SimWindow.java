import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class SimWindow extends JComponent{
    int width;
    int height;
    Pixel pixel;
    // Defalut Constructor
    SimWindow(int w, int h)
    {   
        pixel = new Pixel( 0,0); 
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        pixel.drawPixel(g2d);
    }
}
