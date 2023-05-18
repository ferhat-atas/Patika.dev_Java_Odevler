
import java.util.Scanner;


public class Game {
    
   private Scanner sc = new Scanner(System.in);
   
    
    public void start(){
        System.out.println("**********************************");
        System.out.println("Macera oyununa hoş geldiniz.");
        System.out.print("Lütfen bir isim giriniz:");
        String playerName = sc.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın "+player.getName()+" macera adasına hoş geldiniz.");
        System.out.println("Bu sisli ve korkunç adada herşey seni avlamak için bekliyor.");
        System.out.println("Peki avmı olacaksın avcımı?");
        System.out.println("**********************************");
        System.out.println("Lütfen bir karekter seçiniz: ");
        player.selectChar();
                
                
        
        
        
        
        
    }
    
    
}
