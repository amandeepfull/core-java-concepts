import java.io.*;
import java.util.*;

class Account implements Serializable{
	String name="amandeep";
	transient String pass="pannu8233";
	private void writeObject(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();
		String epwd="123"+pass;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is) throws Exception
	{
		is.defaultReadObject();
		String depwd=(String)is.readObject();
		pass=depwd.substring(3);
		
	}
	public String toString()
	{
		return "name="+name+" "+"pass="+pass;
	}
}

class Driver
{
public static void main(String agr[])
{
	try {
		
Account a=new Account();
//Serialization
System.out.println("serialization takes place");
FileOutputStream fos=new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(a);


//deserilazation
System.out.println("deserlization takes place");
FileInputStream fis =new FileInputStream("abc.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Account a2=(Account)ois.readObject();
System.out.println(a2);
	}
	catch(Exception e)
	{
		
	}
}

}