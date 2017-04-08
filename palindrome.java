import java.io.*;
import java.util.*;
class abc
{
public static void main(String ag[])
{
String str="madamo";
char ch[]=str.toCharArray();
String strrev="";
for(int i=ch.length-1;i>=0;i--)
{
	strrev=strrev+ch[i];
}
if(str.equals(strrev))
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not a palindrome");
}
}
}