
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
    
    public Shape(String colour, boolean filled)
    {
        this.colour=colour;
        this.filled=filled;
    }

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
