import java.io.*;
import java.util.*;
 
 class employee
 {
 int id;
 float sal;
 
 employee(int i,float s)
 {
id=i;
sal=s; 
 }
 }
 
 
 class driver
 {
 public static void main(String ar[])
 {
	 int i;
 employee em=new employee(35,57.6f);
 employee ad[]=new employee[3];
 
 for(i=0;i<3;i++)
 {
	 ad[i]=new employee(65,87.9f);
	 
 }
 System.out.println("array ");
 
 ArrayList l=new ArrayList();
 for( i=0;i<3;i++)
 {
	 l.add(ad[i]);
 }
 
 Iterator it=l.iterator();
 
 while(it.hasNext())
 {
	 for(i=0;i<3;i++)
	 {
	employee s =(employee)it.next();
	 System.out.println("id and salary obj"+i+" is "+s.id+" and  "+s.sal);
	 }
 }
 }
 }
