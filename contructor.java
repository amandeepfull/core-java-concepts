import java.io.*;


class test

{
	int a,b;
int c;
test(int x,int y)
{
this.a=x;
this.b=y;
c=x+y;
System.out.println("value of c:	"+c);
}
public static void main(String aru[])
{
	test t1=new test(3,5);
	System.out.println("values of c is :	"+t1.c);
}
}