class Outer
{
    public void show()
	{
		System.out.println("In outerclass show");
	}
	
	class Inner
	{
		public void show()
		{
			System.out.println("In inner class show");
		}
	}
	
	static class InnerStatic
	{
		public void show()
		{
			System.out.println("In inner static class show");
		}
	}
}


class InnerClass
{
    public static void main(String[] args)
    {
        Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj2 = obj.new Inner();
		obj2.show();
		
		Outer.InnerStatic obj4 = new Outer.InnerStatic();
		obj4.show();
		
		Outer obj3 = new Outer()
		{
			public void display()
			{
				System.out.println("In annonymouse Innner class");
			}
		};
		
		//obj3.display();
    }
}