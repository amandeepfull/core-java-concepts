import java.io.*;
class abc


{

public void display()
{
System.out.println("base display");
}

public void show()
{
System.out.println("base show");
}

static int fact(int x)
{
	return ++x;
}
}


class xyz extends abc
{


public void display()
{
System.out.println("derived display");
}

public void show()
{
System.out.println("derived show");
}
}

class driver extends xyz
{
public static void main(String arg[])

{
	
	
driver	a=new driver();

System.out.println(a.fact(fact(fact(5))));


}

}