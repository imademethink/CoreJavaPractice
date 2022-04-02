public class Demo
{
    public static void main()
    {
        System.out.println("Another main");
    }

    public void add(int a, int b)
    {
        int c = a + b;
        System.out.println(c);
        if (c < 0) {
            return;
        }
        c = c + 10;
        c = c + 40;
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        System.out.println("main 123");
        String name = "Pune";
        System.out.println("My Java");
        Demo d = new Demo();
        d.add(4,6);
        System.out.println(Math.sqrt(99));
    }

}
