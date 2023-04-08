
public class Main {

  
    public static void main(String[] args) {
        
        Book HarryPotter = new Book();
        
        HarryPotter.setKitapSayfasi(-100);
        HarryPotter.setKitapAdi("JAVA");
        
        System.out.println("Kitap ADI: "+ HarryPotter.getKitapAdi());
        System.out.println("Kitap SAYFASI: "+ HarryPotter.getKitapSayfasi());
    }
    
}
