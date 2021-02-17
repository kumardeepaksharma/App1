class Method
{
void get(int a)
{
System.out.println("deepak");
}
}
class Boom extends Method
{
	void get(int a,int b)
	{
	System.out.println("sharma");
	}
}
class Dom extends Boom
{
	public static void main(String args[])
	{
		Dom m=new Dom();
		m.get(4);
		m.get(4,5);
		
	}
}