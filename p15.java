class A{
    public void p1()
    {
        System.out.println("this is A class");
    }
}
class B extends A{
    public void p2()
    {
        System.out.println("this is B class");
    }
}
class C extends B{
    public void p3()
    {
        System.out.println("this is C class");
    }
}
public class StudentAccount {
    public static void main(String[] args) {
        C obj=new C();
        obj.p1();
        obj.p2();
        obj.p3();
    }

}
