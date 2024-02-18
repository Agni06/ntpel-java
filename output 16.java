class cat 
{
    void speak()
    {
        System.out.println("Meaon");
        
    }
    
     
    
}
class petCat extends cat
{
   
    void speak()
    {
        System.out.println("pet cat Meaon");
    }
    
    
}

class magicCat extends cat{
    static boolean noOne;
    void speak()
    {
        if(noOne)
        {
            super.speak();
            
        }
        else{
            System.out.println("hello world");
            
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    petCat pc = new petCat();
	    magicCat mc = new magicCat();
	    mc.noOne = true;
	    mc.speak();
	    pc.speak();
	    mc.noOne = false;
	    mc.speak();
	    pc.speak();
	    
	    
	   
	    
	}
}
