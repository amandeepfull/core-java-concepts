interface ISample// default access modifier is default
{
	public final int x=5;
	int y=5;
	public void show();
	void display();
}
interface ISample2
{
	public void show();
}
class MySample implements ISample
{
	public void show()
	{
		System.out.println("Hello-Show");
	}
	//void display()// Error-Attempting to access weaker access privilege
	public void display()
	{
		System.out.println("Hello-Display");
	}
}
class MySample2 implements ISample,ISample2
{
	public void show()
	{
		System.out.println("Hello-Show-MySample2");
	}
	public void display()
	{
			System.out.println("Hello-Display-MySample2");
	}
}

public class InterfaceDriver
{
	public static void main(String args[])
	{
		MySample m1=new MySample();
		//ISample m1=new MySample();
		m1.show();
		System.out.println("m1.x="+MySample.x);// varibles are implicitly static and final
		m1.display();
		//m1.y=m1.y+5;// Error-Cannot assign vale to a final variable
		System.out.println("m1.y="+m1.y);

		// Using Reference
		ISample i = new MySample();
		i.show();

		// Two Interfaces Containing Same Method Signature
		MySample2 m2=new MySample2();
		m2.show();

}
}