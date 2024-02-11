class vehicle{
    void mov()
    {
        System.out.println("vehicle moves");
        
    }
    
}
class car extends vehicle
{
   
    void mov()
    {
        System.out.println("car moves");
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
		vehicle obj = new car();
		
		obj.mov();
		
	}
}
