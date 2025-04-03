 public class Shape{
     public void area(float radius){
         System.out.println("the area of Circle : " + ((radius * radius) * 3.14));
     }
     public void area(float legnth , float width ){
         System.out.println("the area of rectangle : " + (legnth *width));
     }
     public static void main(String[] args) {
         Shape obj= new Shape();
         obj.area(5);
         Shape obj2= new Shape();
         obj2.area(5,10);
     }
 }
