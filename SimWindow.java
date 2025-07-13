import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.geom.*;

public class SimWindow extends JComponent{
    int width;
    int height;
    int[][] grid;
    Pixel pixel;
    JFrame frame;
    Material sand = new Material(new Color(200,190,40), "Sand");
    // Defalut Constructor
    SimWindow(int w, int h)
    {   
        width = w;
        height = h;
        grid = new int[width][height];        
        fillGrid();
    }

    public void fillGrid()
    {
        for(int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                grid[i][j] = 0;
            }
        }
    }
    
    // public void movePixel(int time)
    // {   
    //     for (Pixel pixel : Pixels) {
    //         if(pixel.y >= 800)
    //         {
    //             pixel.y = 650;
    //         }
    //         else 
    //         {
    //             pixel.y = (int) (pixel.y + (9.81 * time));
    //         }
    //     }
       
    // }

    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        grid[200][200] = 1;
        for(int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                Rectangle2D.Double r = new Rectangle2D.Double(i,j,1,1);
                g2d.setColor(new Color(200 * grid[i][j],190 * grid[i][j],40 * grid[i][j]));
                g2d.fill(r);
            }
        }
    }


}
