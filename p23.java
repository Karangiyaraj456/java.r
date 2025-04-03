class myException extends Exception{
    String detail;
    myException(String s){
        detail=s;
    }
    public String toString(){
        return detail;
    }
}
public class student{
    public static void main(String[] args) {
        try {
            throw new myException("Divided to zero");
        } catch (Exception e) {
            System.out.println("caughtte");
        }
    }
}
