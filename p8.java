public class Rectangle{
    double height;
    double weight;
    public Rectangle(double h , double w){
        this.height = h;
        this.weight = w;
    }
    public static void main(String[] args) {
        Rectangle obj = new  Rectangle(5.2 , 10.2);
        System.out.println(obj.height);
        System.out.println(obj.weight);
    }
}
