import java.io.*;
import java.util.*;
//import java.math.*;
class test
{
	public static void main(String st[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tt,aa,bb,nn;
		double t=0,a=0,b=0,n=0,p=0;
		
		
		/*t=2;
		a=0;
		b=2;
		n=10;*/
		try{
		tt=br.readLine();
		t=Double.parseDouble(tt);
		}
		catch(Exception e)
		{
			
		}

			for(double j=0;j<2;j++)
			{
				try{
				aa=br.readLine();
				a=Double.parseDouble(aa);
				bb=br.readLine();
				b=Double.parseDouble(bb);
				nn=br.readLine();
				n=Double.parseDouble(nn);
				}
				catch(Exception e)
				{
					
				}
		for(double i=0;i<n;i++)
		{
			p=(int)Math.pow(2,i);
		a=a+p*b;
		
			//a=Math.pow(b,i);
			System.out.print((int)a+" ");
		}
		
			}
	}
}