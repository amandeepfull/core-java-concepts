class StaticDemo
{
	static{		System.out.println("Static block initialized");
	}
	
	
	StaticDemo(){
			System.out.println("Static Demo Constructor");
	}
}
public class StaticDriver{
	public static void main(String args[])
	{
		new StaticDemo();
	}
}	