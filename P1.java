package pkg2;
public  class P1
{
	public static void main(String a[])
	{
		System.out.println("Inside pkg1");
	}
}


/*
Exceution Steps:

F:\Intersession 2015-2016>cd Programs

F:\Intersession 2015-2016\Programs>javac -d . P1.java

F:\Intersession 2015-2016\Programs>java pkg2.P1
Inside pkg1

F:\Intersession 2015-2016\Programs>


F:\Intersession 2015-2016\Programs>java pkg2/P1
Inside pkg1

*/