import java.awt.BorderLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        SimWindow wind = new SimWindow(1000,1000);
        frame.setTitle("FALLING SAND");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Possibly change this?
        frame.setLayout(new BorderLayout());
        frame.setSize(1000,1000);
        frame.add(wind,BorderLayout.CENTER);
        frame.setVisible(true);
      

   
    }
}
