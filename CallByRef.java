class Test2
{
	int a,b;

	Test2(int p,int q){
		a=p;
		b=q;
	}

	public void method(Test2 ob1)
	{
		ob1.a++;
		ob1.b--;
	}

}

public class CallByRef
{
	public static void main(String args[])
	{
		Test2 ob = new Test2(100,101);
		System.out.println("Before call method(ob), ob.a="+ob.a+" ob.b="+ob.b);
		ob.method(ob);
		System.out.println("After call method(ob), ob.a="+ob.a+" ob.b="+ob.b);
	}

}