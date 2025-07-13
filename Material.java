import java.awt.*;


public class Material {
    //Might add some refelctivity or something to make this something other than just color
    private Color color;
    private String name;
    public Material(Color c, String n)
    {
        name = n;
        color = c; 
    }


    public Color getColor()
    {
        return this.color;
    }
}
