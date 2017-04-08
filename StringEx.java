public class StringEx
{
public static void main(String args[]){
	String s1 = new String("VIT University");
	String s2 = "Vellore-14";
	String s4 = "VEllOrE-14";
	System.out.println("s1.length()="+s1.length());
	System.out.println("s1.charAt(int index)="+s1.charAt(5));
	char s3[]=new char[10];
	s1.getChars(0,7,s3,2);
	for(int i=0;i<s3.length;i++)
		System.out.println("s3["+i+"]="+s3[i]);
	System.out.println("s2.equals(s4)="+s2.equals(s4));
	System.out.println("s2.equalsIgnoreCase(s4)="+s2.equalsIgnoreCase(s4));
	System.out.println("s2.startsWith(Vel)="+s2.startsWith("Vel"));
	System.out.println("s2.endsWith(-14)="+s2.endsWith("-14"));
	System.out.println("s2.startsWith(string,prefix)="+s2.startsWith("ore",3));
	System.out.println("s2.compareToIgnoreCase(s4)="+s2.compareToIgnoreCase(s4));
	System.out.println("s2.compareTo(s4)="+s2.compareTo(s4));

	String str = "How was your day today?";
	System.out.println("str.indexof(t)"+str.indexOf('t'));
	System.out.println("str.indexof(was)"+str.indexOf("was"));
	System.out.println("str.indexof(char,int)"+str.indexOf('a', 6));
	System.out.println("str.indexof(String,2)"+str.indexOf("was", 7));


}
}
