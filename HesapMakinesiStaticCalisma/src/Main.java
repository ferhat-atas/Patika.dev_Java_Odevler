
import java.util.Scanner;


public class Main {

    
    
    
    public static void main(String[] args) {
       
        
        double number1;
        double number2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1. sayı: ");
        number1 = sc.nextDouble();
        System.out.print("2. sayı: ");
        number2 = sc.nextDouble();
        System.out.println("*******************************");
        System.out.println("Topla : "+ (int) Transaction.total(number1, number2));
        System.out.println("Çıkar : "+ (int) Transaction.subtract(number1, number2));
        System.out.println("Çarp  : "+ (int) Transaction.product(number1, number2));
        System.out.println("Böl   : "+ (int) Transaction.divide(number1, number2));
    }
    
}
