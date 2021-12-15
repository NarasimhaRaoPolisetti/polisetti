class Nonstatic 
{
	public void name()
	{
		System.out.println("narasimha");
	}
	public void rollno()
	{
		System.out.println("63");
	}
	public static void main(String[] args) 
	{
		System.out.println();
		Nonstatic s1=new Nonstatic();
		s1.name();
		s1.rollno();
	}
}
