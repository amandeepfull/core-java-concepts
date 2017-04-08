import java.io.*;

interface shape
{
	float pi=3.14f;
	public void area();
}

class rectangle implements shape
{
	int len,bre,are;
	rectangle(int a,int b)
	{
		len=a;
		bre=b;
		
	}
	
	public void area()
	{
		are=len*bre;
		System.out.println("area of rectangle is:	"+are);
		
	}
}

class driver
{
	public static void main(String ar[])
	{
		rectangle rec=new rectangle(7,8);
		rec.area();
	}
}