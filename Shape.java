
/**
 * Superclass - Shape
 *
 * Cindy Weng 
 * Jan. 11
 */
public class Shape
{

    private String colour;
    private boolean filled;
    
    /**
     * Constructor for objects of class Shape
     */
    public Shape(String colour, boolean filled)
    {
        this.colour=colour;
        this.filled=filled;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calculateArea(){
        return 0;
    }
    
    public double calculatePerimeter(){
        return 0;
    }
    
    public String displayInfo(){
        return this.getClass()+" colour: "+colour+" filled: "+filled;
    }
    
    public String displayGeometricInfo(){
        return "Area: "+calculateArea()+"\nPerimeter: "+calculatePerimeter();
    }
    
    public String getColour(){
        return colour;
    }
    
    public boolean getFilled(){
        return filled;
    }
    
    public void setColour(String c){
        colour=c;
    }
    
    public void setFilled(boolean f){
        filled=f;
    }
}
