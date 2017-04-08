import java.io.*;
import java.util.*;

class test
{
public static void main(String aru[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to reversse:	")
String s1=sc.nextLine();

char c[]=s1.toCharArray(s1);
for (int i=c.length;i>=0;i--)
{
	System.out.println("the reversed String is:	"+c[i]);
}
}
}