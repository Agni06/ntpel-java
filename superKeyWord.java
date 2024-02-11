class sweet{
    void price()
    {
        System.out.println("price 10");
        
    }
    
}
class suger extends sweet
{
   
    void price()
    {
        super.price();
        System.out.println("price 20");
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
		suger obj = new suger();
		
		
		obj.price();
		
	}
}
