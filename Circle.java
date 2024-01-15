
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    double radius;

    public Circle(double r, String colour, boolean filled){
        super(colour, filled);
        radius=r;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    
    @Override
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
