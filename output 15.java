class a 
{
    int i;
    
     
    
}
class b extends a 
{
    int i;
    b(int a,int b)
    {
        super.i = a;
        i = b;
        
    }
    void show()
    {
        System.out.println(super.i);
        System.out.println(i);
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	    b obj = new b(1,2);
	    obj.show();
	    
	   
	    
	}
}
