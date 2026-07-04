abstract class A
{
    public void show()
    {
        System.out.println("By Raj");
    }

    public abstract void display();
}

class B extends A
{
    public void show()
    {
        System.out.println("By John");
    }

    public void display()
    {
        System.out.println("Implementation of abstract method");
    }
}


class AbstractExample
{
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();
        obj.display();
    }
}