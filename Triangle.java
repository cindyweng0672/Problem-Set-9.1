import java.util.*;
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape
{
    // instance variables - replace the example below with your own
    protected ArrayList<Double> sides=new ArrayList<Double>();

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(double side1, double side2, double side3, String colour, boolean filled)
    {
        super(colour, filled);
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }
    
    public Triangle(String colour, boolean filled){
        super(colour, filled);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calculateArea(){
        double n=calculatePerimeter()/2;
        
        return Math.sqrt(n*(n-sides.get(0))*(n-sides.get(1))*(n-sides.get(2)));
    }
    
    public double calculatePerimeter(){
        int p=0;
        
        for(int i=0; i<sides.size(); i++){
            p+=sides.get(i);
        }
        
        return p;
    }
    
    public double getSide1(){
        return sides.get(0);
    }
    
    public double getSide2(){
        return sides.get(1);
    }
    
    public double getSide3(){
        return sides.get(2);
    }
    
    public void setSide1(double l){
        sides.set(0, l);
    }
    
    public void setSide2(double l){
        sides.set(1, l);
    }
    
    public void setSide3(double l){
        sides.set(2, l);
    }
}
