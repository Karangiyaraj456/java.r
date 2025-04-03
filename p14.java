class A{obj
    public void f1() {
        System.out.println("class A");
    }
}
class B extends A {
    public void f2() {
        System.out.println("class B");
    }
}

public class Main{
        public static void main(String[] args) {
          B obj=new B();
            obj.f1();
            obj.f2();
        }
     }
