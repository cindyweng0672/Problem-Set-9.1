
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Shape
{
    private Triangle trig;
    private Square sqr;
    /**
     * Constructor for objects of class House
     */
    public House(Triangle trig, Square sqr, String color, boolean filled)
    {
        super(color, filled);
        this.trig=trig;
        this.sqr=sqr;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public double calculateArea(){
        double area=trig.calculateArea()+sqr.calculateArea();
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter=trig.calculatePerimeter()+sqr.calculatePerimeter()-2*sqr.getSideLen();
        return perimeter;
    }
    
    public Triangle getTrig(){
        return trig;
    }
    
    public Square getSqr(){
        return sqr;
    }
    
    public void setTrig(Triangle t){
        trig=t;
    }
    
    public void setSqr(Square s){
        sqr=s;
    }
}
