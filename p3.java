import java.util.*;
public class p3 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        
        int reversedNumber = 0;
        
        while (a != 0) {
            int digit = a % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            a /= 10; 
        }
        
        System.out.println("Reversed number: " + reversedNumber);
    }
}