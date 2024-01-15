
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double r, String colour, boolean filled){
        super(colour, filled);
        radius=r;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    
    public double calculatePerimeter(){
        return Math.PI*2*radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double r){
        radius=r;
    }
}
