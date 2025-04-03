interface Animal{
    public void eat();
}
interface sound{
    public void makesound();
}
class Dog implements Animal,sound{
    public void eat(){
         System.out.println("i can eat..");
    }
    public void sound(){
        System.out.println("i can break....");
    }
}
public class Main{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.sound();
    }
}
