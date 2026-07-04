@FunctionalInterface
interface A
{
	void show(int a);
	//void duso(); cannot create more than one method in a functional interface
}


class B implements A
{
	public void show(int a)
	{
		System.out.println("in B show: " + a);
	}
}

class Interfaces
{
	public static void main(String[] s)
	{
		A obj = new B();
		obj.show(2);
		
		A obj2 = (a) -> System.out.println("in ABC show: " + a);
		obj2.show(4);
		
	}
}