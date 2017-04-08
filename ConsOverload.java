import java.io.*;
class A1
{
	int g,h,k;
	A1(){}
	A1(int g1,int h1, int k1)
	{
		System.out.println("called 3 Params");
		g=g1;
		h=h1;
		k=k1;
	}
	A1(int g1,int k1)
	{
		System.out.println("called 2 Params");
		g=g1;
		k=k1;
		h=g+k;
	}
}
public class ConsOverload
{
	public static void main(String args[]) throws IOException
	{
		A1 a1 = new A1();
		int f1,f2;
		System.out.println("a1.g="+a1.g);
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Enter f1");
		f1=Integer.parseInt(din.readLine());
		System.out.println("Enter f2");
		f2=Integer.parseInt(din.readLine());
		A1 a2=new A1(f1,f2);
		System.out.println("a2.h="+a2.h);
	}
}

