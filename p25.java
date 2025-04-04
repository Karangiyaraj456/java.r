class Thread1 extends Tharead{
  public void run(){
    try{
      while(true){
        sleep(1000);
        System.out.println("Tharead1");
      }
    }
    catch(interrupted Exception e){}
  }
}
class Thread2 extends Tharead{
  public void run(){
    try{
      while(true){
        sleep(2000);
        System.out.println("Tharead2")
      }
    }
    catch(Interrupted Excaption e){}
  }
}
class Main{
  public static void Main(String[] args){
    Tharead1 t1=new Tharead1();
    Tharead1 t2=new Tharead2();

    t1.start();
    t2.start();
    
  }
}
