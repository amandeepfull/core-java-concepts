class Type1
{
	int c;
	Type1(){c=0;}
}

public class TypeCheck extends Type1
{
	public static void main(String args[])
	{
		int x=20;
		float y = x;
		System.out.println("y="+y);  // Automatic Type Conversion

		/*char c='y';
		boolean b=c;
		System.out.println("b="+b);  // Incompatible Types Error
		*/

		double d=345.561234567891;
		y=(float)d;
		System.out.println("d="+d);  // Possible Loss of Precision
		System.out.println("y="+y);

		double te=345.561234567891;
		x=(int)te;
		System.out.println("x="+x);  // Truncation

		/*char c='y';
		boolean b=(boolean)c;
		System.out.println("b="+b);   // Inconvertible types
		*/

		double s=765454.6;
		short g=(short)s;		// Explicit type cast
		System.out.println("g="+g);


		char c='y';
		int num=65;
		c=(char)num;
	    System.out.println("c="+c);   // If No typecast - Possible Loss of Precision
					                     // If casted, Corresponding ASCII Code value

		byte b3=127;
		byte b4=(byte)(b3*2);			// Possible Loss of Precision
		System.out.println("b4="+b4);



		byte a1 = 40;
		byte b1 = 50;
		byte c1 = 100;
		int  d1 = a1 * b1 / c1;
		// Intermediate Expression values are promoted
		//to int automatically
		System.out.println("d1="+d1);

		TypeCheck t1=new TypeCheck();
		Type1 t2 = new Type1();

		if(t2 instanceof TypeCheck)
			System.out.println("OBJECT OF TYPECHECK");
		else
			System.out.println("OBJECT OF TYPE1");

		// Compiler will not accept the above instanceof checking for the classes
		// originating from different branches.
	}
}
