import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class Main implements MouseMotionListener{
    int height;
    int width;
    public static SimWindow wind = new SimWindow(1000,1000); 

    public void setup()
    {
        JFrame frame = new JFrame();
        frame.setTitle("FALLING SAND");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Possibly change this?
        frame.setLayout(new BorderLayout());
        frame.setSize(1000,800);
        frame.add(wind,BorderLayout.CENTER);
        frame.setVisible(true);
        wind.addMouseMotionListener(this);
    }
    
    public static void main(String[] args)
    {
        int time = 0;
        Main main = new Main();
        main.setup();
        
        //Amimation down
        // while (time < 100)
        // {   
        //     wind.movePixel(time);
        //     wind.repaint();
        //     try {
        //         Thread.sleep(50);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        //     time++;
        // }
        // wind.repaint();
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Current X:" + e.getX() + " Current Y: " + e.getY());
        wind.grid[e.getX()][e.getY()] = 1;
        wind.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
    }
}
