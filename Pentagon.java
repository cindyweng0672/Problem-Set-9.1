
public class Pentagon extends Triangle
{
    private double sideLen;
    
    public Pentagon(double sideLen, String colour, boolean filled)
    {
        super(colour, filled);
        for(int i=0; i<5; i++){
            sides.add(sideLen);
            
            System.out.println(sides.get(i));
        }
        this.sideLen=sideLen;
    }
    
    @Override
    public double calculateArea(){
        double area=(double)1/4*Math.sqrt(5*(5+2*Math.sqrt(5)))*sideLen*sideLen;
        return area;
    }
    
    
    public double getSideLen(){
        return sideLen;
    }
    
    public void setSideLen(double l){
        sideLen=l;
    }
}
