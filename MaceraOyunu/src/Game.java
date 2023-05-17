
import java.util.Scanner;


public class Game {
    
   private Scanner sc = new Scanner(System.in);
    
    public void start(){
        System.out.println("**********************************");
        System.out.println("Macera oyununa hoş geldiniz.");
        System.out.print("Lütfen bir isim giriniz:");
        String name = sc.nextLine();
        System.out.println("1- Samuray\n2- Okçu\n3- Şovalye");
        System.out.print("Lütfen Oyuncu seçiniz: ");
        String player = sc.nextLine();
        
    }
    
    
}
