import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{
		
		String s = new String(sc.next());
		char c[]  = s.toCharArray();
		//System.out.println("Length(s)="+s.length());
		char d[]  = new char[s.length()];
		int j=0;
		for(int i=c.length-1;i>=0;i--)
		{
			d[j] = c[i];
			j++;
		}
		//String s2 = new String(d);
		System.out.println(s2);
		if(s.equals(s2))

			System.out.println("Palindrome");
		else

			System.out.println("Not Palindrome");




	}
}