import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
int a=10,12;
int b=20;
int c=modify(a,b);

System.out.println("a "+a);
System.out.println("c "+c);
}

public static int modify(int x, int y)
{
	x=x+2;
	y=y-3;
	int d=x-y;
	System.out.println("d "+d);
	return d;
	
}
}