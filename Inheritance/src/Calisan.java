
public class Calisan {
    
    private String adSoyad;
    private String telefon;
    private String eposta;
    
    public Calisan(String adSoyad, String telefon, String eposta){
        
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta(){
        return eposta;
    }
    
    public void setEposta(String eposta){
        this.eposta = eposta;
    }
    
    public void cıkıs(){
        System.out.println(this.adSoyad+" çıkış yaptı.");
    }
    
    public void giris(){
        System.out.println(this.adSoyad+" giriş yaptı.");
    }
    
    public void giris(String girisSaati){
        
        System.out.println(this.adSoyad+" saat "+ girisSaati +" de "+" giriş yaptı.");
    }
    
    public void giriş(String girisSaati, String cıkısSaati){
        System.out.println(this.adSoyad+" saat "+girisSaati+" de giriş yaptı. "+ " saat " +cıkısSaati+" de çıkış yapacak.");
    }
    
    public void yemekhane(){
        System.out.println(this.adSoyad+" yemek haneye giriş yaptı.");
    }
    
    public void girisYapanlar(Calisan [] girisYapanlar ){
        
        for (Calisan c : girisYapanlar) {
            c.giris();
        }
    }
    
    
    
    
}
