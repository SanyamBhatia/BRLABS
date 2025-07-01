public class MyClass
{
    public void myMethod()
    {
        int x= 1;
        int y = 2;
        int q = x+y;
        System.out.println(q);
    }
    public static void main(String[] args)
    {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}