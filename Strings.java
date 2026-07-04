class Strings
{
    public static void main(String s[])
    {
        String a = "abc"; 
        String b = "abc";

        String c = new String("abc"); //we explicitly telling java to Create a new String object on the heap
        String d = new String("abc").intern(); //intern() returns the pooled version of the string.

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(c==d);
    }
}