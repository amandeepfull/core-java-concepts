import java.io.*;

class test
{
public static void main(String ar[])
{
	//	charAt
	String str="amandeep singh";
	char c=str.charAt(4);
	System.out.println("character  of string by index: "+c);
	
	//getchars
	
	char ch[]={'a','d','g','r','s','y','r','e','s','r','y','e'};
	str.getChars(2,10,ch,3);
	System.out.println(ch);
	
	//startsWith
	if(str.startsWith("ama"))
	{
		System.out.println(str);
	}
	else
	{
		System.out.println("no body");
	}
	
	//endswith
	
	//compareto
	
	String str2="welcome";

String str3="aman";

int a;
a=str2.compareTo(str3);
System.out.println("value of a is :"+a);

//value of
char c1[]={'d','g','d','g','r','u','r','s','o','z','c','d','s','m','n'};
String s;
System.out.println(String.valueOf(c1));

//replace

String str6="  university   ";
String str7;

str7=str6.replace('i','a');
System.out.println(str7);


//trim

str7=str6.trim();
System.out.println(str7);

//concat

System.out.println("am".concat("an").concat("deep"));

//substring

String str8="uviversity";
System.out.println(str8.substring(2,9));

//indexof

String str9 = "How was the day";
System.out.println(str9.indexOf('a',5));

//lastindex of

String str10 = new String("Welcome to Tutorialspoint.com");
System.out.println(str10.lastIndexOf('o'));

}


}