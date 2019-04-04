class Operation
{
	int a = 10;
	int b = 20;
	String s;
	float f;
	
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub()
	{
		int q = b - a;
	    s = Integer.toString(q);
		System.out.println(s);
	}
	
	public void mul()
	{
		f = a*b;
		System.out.println(f);
	}
	
 public static void main(String[] args)
 {
 System.out.println("Hello Man");
 Operation o=new Operation();
 o.add();
 o.sub();
 o.mul();
 }

}