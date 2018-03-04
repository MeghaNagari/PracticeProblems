 class ParentClass
{
	public void print()
	{
		System.out.println("this is parent");
	}
}

 class ChildClass extends ParentClass
{
	public void print()
	{
		System.out.println("this is child");
	}
}



public class MethodOverridingEx {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass obj=new ChildClass();
		obj.print();
		

	}

}
