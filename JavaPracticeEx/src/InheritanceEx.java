class A
{
	int a=90;
	void show()
	{
		System.out.println("this is A");
	}
	
}


public class InheritanceEx extends A{
	
	int a=99;
	
	void show()
	{
		System.out.println("this is Child");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	A obj=new InheritanceEx();
	
		System.out.println(obj.a);
		obj.show();
		int a=9,b=7;
		if(a>b)
			try {
				throw new Exception("exception thorwed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}}