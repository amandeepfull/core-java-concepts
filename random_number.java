import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	
	int start=1;
	int end=99;
	Random r=new Random();
	for(int i=1;i<10;i++)
	{
		int ran=randomGenerator.nextInt(100);
		showRandomInteger(start,end,r);
	}
}

}