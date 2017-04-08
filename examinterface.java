import java.io.*;

interface shape
{
float pi=3.14f;
public void area();
public void name (String nm);

}

abstract class point implements shape
{
int r=4;
public void area()
{
}
}

 class circle extends point
{
float are;
public void name (String nm)
{
String nam=nm;
System.out.println("shape is "+nam);

}
public void area()
{
are=pi*r*r;
System.out.println("area of circle is:	"+are);
}
}

class cylinder extends point
{
float are,vol;
int h;
cylinder(int x)
{
	h=x;
}
public void name (String nm)
{
String nam=nm;
System.out.println("shape is "+nam);

}
public void area()
{
are=pi*r*h;
System.out.println("area of circle is:	"+are);
}
public void volume()
{
vol=pi*r*r*h;
System.out.println("area of circle is:	"+vol);
}	
}


 class driver
{
public static void main(String ar[])
{
circle c=new circle();
c.name("circle");
c.area();
cylinder c1=new cylinder(3);
c1.name("cylinder");
c1.area();
c1.volume();

}
}