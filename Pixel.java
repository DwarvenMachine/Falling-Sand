import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Pixel {
    Material mat = new Material(); //(Might just be color)
    State state = new State(); //(Air, Liquid, and Solid)
    int x;
    int y; 

    //Constructor
    public Pixel(int nx, int ny)
    {
        x = nx;
        y = ny;
    }


    public void drawPixel(Graphics2D g2d)
    {
        Rectangle2D.Double r = new Rectangle2D.Double(50,75,1,1);
        g2d.setColor(new Color(100,149,237));
        g2d.fill(r);
    }
}
