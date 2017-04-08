class A1
{
	private String a;
	A1()
	{
		System.out.println("BC-No arg");
		a=new String("Senthil");
	}
	A1(String pA)
	{
		System.out.println("BC-1 arg");
		this.a = pA;
	}
	public void printAval()
	{
		System.out.println("A.a="+a);
	}
}
class B1 extends A1
{
	private String b;
	B1()
	{
		System.out.println("DC-No arg");
		b = new String("B");
	}
	B1(String pB)
	{
	System.out.println("DC-1 arg");
		this.b= pB;

	}
	public void printBval()
	{
		System.out.println("B.b="+b);
	}
}
public class InheriTest
{
	public static void main(String a[])
	{
		A1 a1 = new A1();
		a1.printAval();
		B1 b1 = new B1();
		b1.printBval();
	}
}