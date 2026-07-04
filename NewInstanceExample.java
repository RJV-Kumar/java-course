import java.util.*;

class Demo
{

}


class NewInstanceExample
{
    public static void main(String s[]) throws Exception
    {
        //Demo obj = new Demo();
        //Demo obj = (Demo)Class.forName("Demo").newInstance();
        //Demo obj = Demo.class.newInstance();
        //System.out.println(obj);

        //from user input
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Object obj = Class.forName(str).newInstance();
        System.out.println(obj.getClass().getName());


    }
}