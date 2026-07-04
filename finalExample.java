class Calc 
{
	//final public void show() 
	public void show() 
	{
		System.out.println("By Raj");
	}

	public void add(int a, int b)
	{
		System.out.println("Sum is: " + (a + b));
	}
}

//class AdvCalc extends Calc //final class cannot be extended, so this will give an error
final class AdvCalc extends Calc
{
	/* so suppose someone wants to change the show method, they can do it by overriding it in the child class, 
		but if we want to prevent that then we can declare the method as final in the parent class.
	*/
	public void show() 
	{
		System.out.println("By John"); 
	}
}

class ScientificCalc //extends AdvCalc
{
	public void show() 
	{
		System.out.println("By Smith"); 
	}
}

class finalExample
{
	public static void main(String[] s)
	{
		// final  variable
		final int a = 10;
		// a = 20; // this will give an error because we cannot change the value of a final variable, can this for const values like pi, gravity etc.
		System.out.println("Value of a: " + a);

		//final method
		Calc obj = new Calc();
		obj.add(4,2);
		obj.show();

		AdvCalc obj2 = new AdvCalc();
		obj2.add(5, 3);
		obj2.show();

		//final class
		// if we declare a class as final, then we cannot extend it, so we cannot create a child class of it.
		ScientificCalc obj3 = new ScientificCalc();
		//obj3.add(6, 4); 
		obj3.show();
	}
}
