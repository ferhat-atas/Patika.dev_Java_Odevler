
import java.util.Scanner;


public class Game {
    
   private Scanner sc = new Scanner(System.in);
   
    
    public void start(){
        System.out.println("********************************************************************");
        System.out.println("Macera oyununa hoş geldiniz.");
        System.out.print("Lütfen bir isim giriniz:");
        String playerName = sc.nextLine();
        Player player = new Player(playerName);
        System.out.println("********************************************************************");
        System.out.println("Sayın "+player.getName()+" macera adasına hoş geldiniz.");
        System.out.println("Bu sisli ve korkunç adada herşey sizi avlamak için bekliyor.");
        System.out.println("Peki avmı, avcımı olacaksınız?");
        System.out.println("********************************************************************");
        System.out.println("KAREKTERLER");
        player.selectChar();
        System.out.println("********************************************************************");
        
        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println("");
            System.out.println("########### BÖLGELER ##########");
            System.out.println("");
            System.out.println("1.Güvenli Ev --> Burası sizin için güvenli bir ev düşman yoktur.");
            System.out.println("2.Mağaza--> Silah veya zırh satın alabilirsiniz.");
            System.out.println("3.Mağara--> Ödül <Yemek>, dikkatli ol zombi çıkabilir!");
            System.out.println("4.Orman--> Ödül <Odun>, dikkatli ol vampir çıkabilir!");
            System.out.println("5.Nehir--> Ödül <Su>, dikkatli ol ayı çıkabilir!");
            System.out.println("0.Çıkış yap--> Oyunu sonlandır.");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz.");
            int selectLoc = sc.nextInt();
            switch(selectLoc){
                case 0:
                    location = null;
                    break;
                    
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                     System.out.println("Lütfen geçerli bir bölge giriniz!");
                    break;
            }
            
              if(location == null){
                System.out.println("Oyun bitti, gene bekleriz.");
                break;
            }
            
            if(!location.onLocation()){
                System.out.println("Game Over!");
            }
        }
        
        
                
                
        
        
        
        
        
    }
    
    
}
