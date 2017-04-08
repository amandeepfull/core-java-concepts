import java.io.*;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */

class Student 
{
    int rollnumber;
    String name;
    Scanner sc=new Scanner(System.in);
    public void Method()
    {
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter reg no:");
        rollnumber=sc.nextInt();
    }
    public void Display()
    {
        System.out.println("name:"+name);
        System.out.println("regno:"+rollnumber);
    }
}
class Test extends Student
        {
    float total;
    int x[]=new int[5];
    @Override
    public void Method()
    {
        super.Method();
        System.out.println("Enter marks:");
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
            total=total+x[i];
			
        }
		total=total/5;
    }
    public void Display()
    {
        System.out.println("marks:"+x);
        System.out.println("total:"+total);
    }
}




interface Sports
{
    int credit=55;
}



class Result extends Test implements Sports
{
    float avg;
    public void Method()
    {
        super.Method();
        avg=total+credit/6;
    }
    public void Display()
    {
        System.out.println("Average of student:"+avg);
    }
}



 class Driver3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Result r=new Result();
        r.Method();
        r.Display();
    }

}
