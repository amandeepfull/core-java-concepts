import java.io.*;
import java.util.*;
class abc{
	public static void main(String agr[])
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			Integer ii=new Integer(i);
			String s=ii.toString();
			char ch[]=s.toCharArray();
			
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='4')
				{
					
					count++;
				}
			}
		}
		System.out.println(count);
	}
}