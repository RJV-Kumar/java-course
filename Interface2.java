// abstract class Computer 
// {
//     abstract public void code();
// }

interface Computer 
{
    public void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Development in Laptop...");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Development in Desktop...");
    }
}

class Developer
{
    public void devApp(Computer c)
    {
        c.code();
    }
}

public class Interface2
{
    public static void main (String a[]) 
    {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer dev = new Developer();

        dev.devApp(lap);
        dev.devApp(desk);
    }
}

