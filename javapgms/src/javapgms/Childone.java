package javapgms;

public class Childone extends Parentone{
	
	int a=20;
	
	Childone(int a)
	{
		super("checking");
	}
@Override
public void demo()
{
		System.out.println("child method");
	}
	
	public void demoone()
	{
		System.out.println(super.a);
		super.demo();
		System.out.println("child method");
	}
	
	public static void main (String args[])
	{
		Childone c= new Childone(11);
		
		c.demoone();
	}
	
	
}
