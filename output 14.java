class box 
{
    double width, height, depth;
     box(double w,double h, double d)
     {
         this.width = w;
         this.height = h;
         this.depth = d;
         
     }
    box()
    {
        this.width = 0.0;
         this.height = 0.0;
         this.depth = 0.0;
    }
    double volume()
    {
        return width*height*depth;
    }
        
    
}
class boxWeight extends box 
{
    double weight;
    boxWeight()
    {
        this.width = 0.0;
         this.height = 0.0;
         this.depth = 0.0;
         this.weight = 0.0;
        
    }
    boxWeight(double w,double h, double d, double m)
    {
        this.width = w;
         this.height = h;
         this.depth = d;
         this.weight = m;
        
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	    box plain = new box();
	    
		//box objA = new box(10,20,30);
		boxWeight objB = new boxWeight(2,3,4,0.5);
		plain = objB;
		
		double vol = plain.volume();
		System.out.println("volume of box1 " +vol);
		vol = objB.volume();
	    System.out.println("volume of box2 " +vol);
	    
	}
}
