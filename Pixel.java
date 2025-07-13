import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Pixel {
    Material mat; //(Might just be color)
    State state = new State(); //(Air, Liquid, and Solid)
    int x;
    int y; 

    //Constructor
    public Pixel(int nx, int ny, Material m)
    {
        x = nx;
        y = ny;
        mat = m;
    }


    public void drawPixel(Graphics2D g2d)
    {
        Rectangle2D.Double r = new Rectangle2D.Double(this.x,this.y,1,1);
        g2d.setColor(this.mat.getColor());
        g2d.fill(r);
    }
}
