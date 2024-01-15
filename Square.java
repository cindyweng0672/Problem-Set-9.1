
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
