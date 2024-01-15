

public class Rectangle extends Shape
{
    // instance variables - replace the example below with your own
    private double len;
    private double wid;

    public Rectangle(double len, double wid, String colour, boolean filled){
        super(colour, filled);
        this.len=len;
        this.wid=wid;
    }

    @Override
    public double calculateArea(){
        return wid*len;
    }
    
    @Override
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
