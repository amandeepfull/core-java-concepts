import java.io.*;
import java.util.*;


class test

{
public static void main(String arh[])

{
int a[][]=new int[5][2];
int i,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter the values in the array:	");
for(i=0;i<5;i++)
{
	for(k=0;k<2;k++)
	{
a[i][k]=sc.nextInt();		
	}

}


for(i=0;i<5;i++)
{
	for(k=0;k<2;k++)
	{
System.out.println("values of array:	"+a[i][k]);		
	}

}
}
}
