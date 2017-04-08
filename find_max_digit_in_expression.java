import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch[]=str.toCharArray();

StringBuffer sb=new StringBuffer();
Vector<String> v=new Vector<String>();
for(int i=0;i<ch.length;i++)
{
	while (i < ch.length && ch[i] >= '0' && ch[i] <= '9')
	{
		sb.append(ch[i++]);
	}
if(sb.length()>0)
{

	v.add(sb.toString());
	sb.delete(0,sb.length());
}	
}
Iterator ii=v.iterator();
while(ii.hasNext())
{
	String s=(String)ii.next();
	System.out.println(s);	
}
}
}