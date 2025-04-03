 public class Shape{
     Shape(float radius){
         System.out.println("the area of circle : " + ((radius * radius) * 3.14));
     }
     Shape(float legnth , float width ){
         System.out.println("the area of rectangle : " + (legnth *width));
     }
     public static void main(String[] args) {
         Shape obj= new Shape(10);
         Shape obj2= new Shape(5,2);
     }
 }
