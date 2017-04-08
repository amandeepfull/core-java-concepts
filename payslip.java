import java.io.*;
public class payslip
{
private String eid;
private String ename;
private String edes;
private float eallow;
private float educt;
private String eaddre;


//set


public void seteid(String id)
{
	eid=id;
	
}

public void setename(String name)
{
	ename=name;
}

public void setedes(String des)
{
	edes=des;
	
}

public void seteallow(float  allo)
{
	eallow=allo;
	
}

public void seteduct(float dect)
{
	educt=dect;
	
}
public void seteadde(String add)
{
	eaddre=add;
	
}


//get


public String geteid()
{
	return eid;
}

public String getename()
{
	return ename;
}

public String getedes()
{
	return edes;
}

public float geteallow()
{
	return eallow;
}
public float geteduct()
{
	return educt;
}
public String geteaddr()
{
	return eaddre;
}

public static void main(String argp[])
{
	//payslip p1=new payslip();
	int i;
	payslip p1[]= new payslip[3];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try{
	for(i=0;i<3;i++)
	{
		System.out.println("i="+i);
		p1[i]=new payslip();
		System.out.println("enter emp id for p"+i+":	");
		String idi=br.readLine();
		p1[i].seteid(idi);
		
		System.out.println("enter emp name for p"+i+":	");
		String nam=br.readLine();
		p1[i].setename(nam);
		
		System.out.println("enter emp descpription for p"+i+":	");
		String desc=br.readLine();
		p1[i].setedes(desc);
		
		System.out.println("enter emp allowance	for p"+i+":	");
				String allow=br.readLine();
				float allow1=Float.parseFloat(allow);
				p1[i].seteallow(allow1);
				
				System.out.println("enter emp deduction	for p"+i+":		");
				String deduct=br.readLine();
				float deduct1=Float.parseFloat(deduct);
					p1[i].seteduct(deduct1);
					
					
				System.out.println("enter emp Address	for p"+i+":	");
				String addrr=br.readLine();
					p1[i].seteadde(addrr);
				
	}
	}
	catch(Exception e)
	{
		
	}
	
	
	

for(i=0;i<3;i++)
{
	System.out.println("emp id for p"+i+":	"+p1[i].geteid());
	System.out.println("emp name for p"+i+":	"+p1[i].getename());
	System.out.println("emp description for	p"+i+":	"+p1[i].getedes());
	System.out.println("emp allowances for	p"+i+":	"+p1[i].geteallow());
	System.out.println("emp deduction for	p"+i+":	"+p1[i].geteduct());
	System.out.println("emp address for	p"+i+":	"+p1[i].geteaddr());
}
}
}