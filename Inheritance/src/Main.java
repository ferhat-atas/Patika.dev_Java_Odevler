
public class Main {

   
    
    
    public static void main(String[] args) {
       
        Calisan c1 = new Calisan("Ferhat Ataş", "0500 000 00 00", "non@gmail.com");
        
        
        
        OgretimGorevlisi o1 = new OgretimGorevlisi("Matematik", "Matematik", "Prof", "Hamza Ataş", "68806657", "fkshkfs@sfjsdf");
       // Akademisyen a1 = new Akademisyen("Fizik", "doc", "Ferhat Ataş", "0900 000 00 00", "gelme@com.tr"); 
       //Akasemisyen abstract bir sınıf olduğu için artık nesne üretemiyoruz. Bize bir klavuz şablon gibi yardımcı oluyor.
        //o1.DerseGir();
        //o1.SenatoToplantisi();
        //o1.yemekhane();
        //c1.giris("13");
        //o1.giriş("9", "17");
        //a1.giris();
        
        Calisan[] girisYapanlar = {c1,o1};
        c1.girisYapanlar(girisYapanlar);
    }
    
}
