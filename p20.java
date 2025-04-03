abstract class shape{
    abstract void area();
} 
class Triangle extends shape{
    double base,height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
}
@Override;
void area(){
    double result=os.*base*height;
    System.out.println("area of Triangle "+result);
}
public class Rectangle extends shape {
    double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
}
@Override;
void area(){
    double result=length*width;
    System.out.println("the area of Rectange :"+result);
}
class circle extends shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
}
@Override;
void area(){
    double result=math.PI*radius*radius;
    System.out.println("area of circle result :"+result);
}
public class shapeDemo{
    public static void main(String[] args) {
        shape triangle=new Triangle(5,10);
        shape rectangle=new Rectangle(4, 6);
        shape circle=new circle(7);
        triangle.area();
        rectangle.area();
        circle.area();
    }
}
