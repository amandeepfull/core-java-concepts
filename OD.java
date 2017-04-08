class OD{
	int pX;
	void show(int z){
		System.out.println("Show(int) invoked");
	}
	void show()
	{
		System.out.println("Show() invoked");
	}
	void show(int pZ,double pD)
	{
		System.out.println("Show(int,double) invoked");
	}
	void show(double x,double y)
	{
		System.out.println("Show(double,double) default arg invoked");
	}

	public static void main(String args[])
	{
		OD p = new OD();
		int x=234;
		p.show(x);  //show(int)
		p.show();  //show()
		p.show(23,45); //show((int,int)
		double t=76.4;
		p.show(t); //Error
	}
}
