
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Rectangle
{
    private double sideLen;
    
    public Square(double sideLen, String colour, boolean filled)
    {
        super(sideLen, sideLen, colour, filled); 
        this.sideLen=sideLen;
    }
    
    public double getSideLen(){
        return sideLen;
    }
    
    public void setSideLen(double l){
        sideLen=l;
    }
}
