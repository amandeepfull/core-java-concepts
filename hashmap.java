import java.io.*;
import java.util.*;


class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
Map<Character,ArrayList<Integer>> mm=new HashMap<Character,ArrayList<Integer>>();
int n=sc.nextInt();
int k=sc.nextInt();
 
int a[]=new int[n];
int b[]=new int[k];
for(int i=0;i<2;i++)
{
ArrayList<Integer> d1=new ArrayList<Integer>();
d1.add(i+1);
char c=(char)(120+i);
mm.put(c,d1);

}
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	
	mm.get('x').add(a[i]);
	

}

for(int i=0;i<k;i++)
{
	b[i]=sc.nextInt();
	
	
	mm.get('y').add(b[i]);
	
	
}

 for(Map.Entry o: mm.entrySet())
 {
	 System.out.println(o);
 }
}
}