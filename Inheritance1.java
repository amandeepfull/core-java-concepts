class A
{
	int a;
	int b;
	A()
	{
		a=b=0;
	}
	A(int pA,int pB)
	{

		a=pA;b=pB;
	}
	public void display()
	{
		System.out.println("a="+a+"b="+b);
	}

}

class B extends A
{
	int c;
	int d;
	B(int pA,int pB,int pC,int pD)
	{
		super(pA,pB);
		c=pC;d=pD;
	}

	B(int pC,int pD)
	{
		c=pC;d=pD;
	}
	public void display()
	{
		System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
	}

}
public class Inheritance1
{
	public static void main(String args[])
	{
		A a1 = new A(5,6);
		a1.display();
		B b1=new B(5,6,7,8);
		b1.display();
		B b2=new B(9,10);
		b2.display();

	}
}






