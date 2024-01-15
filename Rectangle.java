
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    // instance variables - replace the example below with your own
    private double len;
    private double wid;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double len, double wid, String colour, boolean filled){
        super(colour, filled);
        this.len=len;
        this.wid=wid;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calculateArea(){
        return wid*len;
    }
    
    public double calculatePerimeter(){
        return 2*(wid+len);
    }
    
    public double getLength(){
        return len;
    }
    
    public double getWidth(){
        return wid;
    }
    
    public void setLength(double l){
        len=l;
    }
    
    public void setWidth(double w){
        wid=w;
    }
}
