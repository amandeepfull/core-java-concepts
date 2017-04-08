import java.io.*;

class test
{
public static void main(String ar[])
{
	StringBuffer s1=new StringBuffer("amandeep singh");
	StringBuffer s3=new StringBuffer("welcome");
	//reverse
	s1=s1.reverse();
	System.out.println("reverse of string: "+s1);
	
	//length
	
	int a;
	a=s1.length();
	System.out.println("length of string: "+a);
	//capacity
	
	int b;
	b=s1.capacity();
	System.out.println("capacity of string: "+b);
	
//	charAt
	char c=s1.charAt(4);
	System.out.println("character  of string by index: "+c);
	//substring
	
	String  s4;
	s4=s3.substring(2,4);
	System.out.println("substring  of string by index: "+s4);
	
	//getChars
	StringBuffer buff=new StringBuffer("hello world");
	
	char chArr[] = {'t','u','t','o','r','i','a','l','s'};
	 buff.getChars(5, 10, chArr, 3);
	 System.out.println(chArr);
	 //set lenth
	 buff.setLength(50);
	int f= buff.length();
	 System.out.println("new length of string : "+f);
	 
	 //delete
	 
	 StringBuffer buff1=new StringBuffer("my name is ");
	 buff1.delete(8,10);
	 System.out.println("deleted of string: "+buff1);
	 
	 
	 //replace
	 StringBuffer buff3=new StringBuffer("my name is ");
	 
	 
	 
	 buff3.replace(4,8,"xyz");
	 System.out.println("replace of string: "+buff3);
}
}