import java.io.*;
import java.util.*;
class A
{
	int a;
	public void sum()
	{
		
	}
}
class B extends A
{
	int b;
	
	B(int x,int y)
	{
		this.a=x;
		this.b=y;
	}
	
}
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b");
int a=sc.nextInt();
int b=sc.nextInt();
B b1=new B(a,b);
System.out.println("b.a= "+b1.a);
System.out.println("b.a= "+b1.b);



}
}