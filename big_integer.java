import java.io.*;
import java.util.*;
import java.math.*;
class abc
{
	public static void main(String agr[])
	{
		String str1="101";
		String str2="103";
		BigInteger bi1=new BigInteger(str1);
		BigInteger bi2=new BigInteger(str2);
		 
		 //addition of bigInteger
		 bi1=bi1.add(bi2);
		 System.out.println("addition="+bi1.toString());
		
		//Multiply of BigInteger
		String str3="101";
		String str4="105";
		 BigInteger bi3=new BigInteger(str3);
		BigInteger bi4=new BigInteger(str4);
		
		bi3=bi3.multiply(bi4);
		System.out.println("multiply="+bi3.toString());
		
/// All arithmatic method of BigInteger class

/*
1. add()
2. multiply();




*/

		
	}
}