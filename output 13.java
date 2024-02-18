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
       super();
         this.weight = 0.0;
        
    }
    boxWeight(double w,double h, double d, double m)
    {
        super(w,h,d);
         this.weight = m;
        
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
		box objA = new box(10,20,15);
		boxWeight objB = new boxWeight(2,3,4,0.5);
		double vol = objA.volume();
		System.out.println("volume of box1 " +vol);
		vol = objB.volume();
	    System.out.println("volume of box2 " +vol);
	    
	}
}
