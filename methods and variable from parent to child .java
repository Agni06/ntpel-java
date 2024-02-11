class parent{
    String name = "parent";
    String message()
    {
        return "parent 10";
        
    }
    
}
class child extends parent
{
   
    String name = "child";
    String message()
    {
        return "child ";
        
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
		parent obj = new child();
		
		
	System.out.println(obj.name + " " + obj.message());
	
		
	}
}
