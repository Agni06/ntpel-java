class A 
{
    int i,j;
    public void showij()
    {
       System.out.println(i+" "+j);
       
    }
}
class B extends A 
{
    int k;
    void showk()
    {
        System.out.println(k);
    }
    void sum()
    {
        System.out.println(i+j+k);
    }
}
public class Main
{
	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		objA.i = 10;
		objA.j = 20;
		System.out.println("contents of A class");
		objA.showij();
		
		objB.i =11;
		objB.j = 22;
		objB.k = 33;
		System.out.println("contents of B class");
		objB.showij();
		objB.showk();
		System.out.println("sum");
		objB.sum();
	}
}
