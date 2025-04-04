import java.util.Linkedlist;
import java.util.Arraylist;

public class main{
  public staic void main(String[] args){
    Aarraylist<String> list1=new Aarraylist<String>();
    Linkedlist<String> list2=new Linkedlist<String>();

    list1.add("monday");
    list1.add("tuesday");
    list1.add("wednesday");
    list1.add("thuresday");
    list1.add("friday");
    list1.add("saturday");
    list1.add("sunday");

    list2.add("junuary");
    list2.add("febuary");
    list2.add("march");
    list2.add("april");
    list2.add("may");
    list2.add("june");
    list2.add("july");
    list2.add("august");
    list2.add("september");
    list2.add("octomber");
    list2.add("november");
    list2.add("december");

    for(String day: list1){
      System.out.println(day);
    }
    for(String month: list2){
      Systm.out.pirntln(month);
    }
  }
}
