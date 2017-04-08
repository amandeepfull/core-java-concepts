import java.io.*;
import java.util.*;
class Account implements Serializable
{
	String name="Amandeep singh";
	transient String pass="aman8859";
	transient int pin=4321;
	transient int cvv=685;
	private void writeObject(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();// default serialization, means all will be first stored in file before customized serialization	
		String pwd="123"+pass;
		int pinchange=123+pin;
		int cvvchange=123+cvv;
		
		os.writeObject(pwd);
		os.writeInt(pinchange);
		os.writeInt(cvvchange);
	
	}
	private void readObject(ObjectInputStream is)throws Exception
	{
		is.defaultReadObject();// default serialization, means all will be first stored in file before customized deserialization
		String pwd=(String)is.readObject();
		pass=pwd.substring(3);
		int pinchange=(int)is.readInt();
		pin=pinchange-123;
		
		int cvvchange=(int)is.readInt();
		cvv=cvvchange-123;
		
	}
	
	public String toString()
	{
		return "name="+name+"pass="+pass+" pin="+pin+"cvv="+cvv;
	}
}

class Driver{
	
	public static void main(String agr[])
	{
		try
		{
		Account a=new Account();
		//Serializaton
		System.out.println("serialization starts ");
		FileOutputStream fos=new FileOutputStream("abc2.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		//desirilization
		System.out.println("deserilizatin done ");
		FileInputStream fis=new FileInputStream("abc2.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a1=(Account)ois.readObject();
		System.out.println(a1);
		}
		catch(Exception e)
		{
		}
	}
}