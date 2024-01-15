import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public static void Main(){
        ArrayList<Shape> shapes=new ArrayList<Shape>();
        Shape s1=new Circle(1, "pink", true);
        shapes.add(s1);
        Shape s2=new Rectangle(3, 4, "purple", false);
        shapes.add(s2);
        Shape s3=new Triangle(3, 4, 5, "yellow", true);
        shapes.add(s3);
        Shape s4=new Square(2, "blue", true);
        shapes.add(s4);
        Shape s5=new Pentagon(1, "red", true);
        shapes.add(s5);
        Shape s6=new House((Triangle)s3, (Square)s4, "orangle", true);
        shapes.add(s6);
        

        
        System.out.println();
        for(Shape s:shapes){
            System.out.println(s.displayInfo());
            System.out.println(s.displayGeometricInfo());
        }
    }
}
