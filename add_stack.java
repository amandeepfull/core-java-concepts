import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
	
	Scanner sc=new Scanner(System.in);
	Stack<Integer> st=new Stack<Integer>();
while(true)
{
	System.out.println("1. push \n 2.pop\n 3.traverse\n 4.Exit");
System.out.println("enter choice :");
int c=sc.nextInt();
switch (c)
{
	case 1: System.out.println("enter the element ");
			int item=sc.nextInt();
			st.push(item);
			System.out.println("Element Entered succesfuly");
	
			break;
	case 2: 		int n=st.pop();
				System.out.println("poped element is "+n);
				System.out.println("element poped successfully");
			break;
			
	case 3: 
				System.out.println("elements in the stack are as ");
				Iterator ii=st.iterator();
				while(ii.hasNext())
				{
					int val=(int)ii.next();
					System.out.println(val);
				}
			break;
			
	case 4: 
			System.exit(0);
}

	
}
}

}