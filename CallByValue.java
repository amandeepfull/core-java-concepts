class Test1
{
	int a,b;
	public void method(int x,int y)
	{
		x++;
		y--;
	}

}

public class CallByValue
{
	public static void main(String args[])
	{
		Test1 ob = new Test1();
		int p =23;
		int q=13;
		System.out.println("Before call method(a,b), p="+p+" q="+q);
		ob.method(p,q);
		System.out.println("After call method(a,b), p="+p+" q="+q);
	}

}