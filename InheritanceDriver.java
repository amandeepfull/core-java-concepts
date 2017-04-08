class Base
{
	int a;
	int b;
	Base(int pA,int pB)
	{
		System.out.println("BC-2 arg");
		a=pA;
		b=pB;
	}
	Base()
	{
		System.out.println("BC-No arg");
		a=b=0;
	}
	public void show()
	{
		System.out.println("BC--->a="+a+"b="+b);
	}
}
class Derived extends Base
{
	int c;
	int b;
	Derived(int pA,int pB, int pC)
	{
		super(pA,pB);
		System.out.println("DC-3 arg");
		b=90;
		this.c=pC;
	}
	Derived()
	{
		super();
		System.out.println("DC-No arg");
		c=0;
	}
	public void show()
	{
		System.out.println("DC:-->a="+a+"b="+b+"c="+c);
	}
}
public class InheritanceDriver
{
	public static void main(String args[])
	{
		Base b1=new Base(5,6);
		Derived d1=new Derived(7,8,9);
		b1.show();
		d1.show();
		Derived d2=new Derived(71,811,91);
		Base b2;
		b2=d2;
		b2.show();

		// Using base class reference accessing the public variable of derived class is restricted
		//System.out.println("b2.a="+b2.a+"b2.b="+b2.b+"b2.c="+b2.c);


		System.out.println("b2.a="+b2.a+"b2.b="+b2.b);
	}
}
