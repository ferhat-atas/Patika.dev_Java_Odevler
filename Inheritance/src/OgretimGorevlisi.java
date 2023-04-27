
public class OgretimGorevlisi extends Akademisyen {
    
    private String dersler;

    public OgretimGorevlisi(String dersler, String bolum, String unvan, String adSoyad, String telefon, String eposta) {
        super(bolum, unvan, adSoyad, telefon, eposta);
        this.dersler = dersler;
    }
    
    public void SenatoToplantisi(){
        
        System.out.println(this.getUnvan()+" "+this.getAdSoyad()+" senato toplantısına girdi.");
    }

    @Override
    public void DerseGir() {
        System.out.println(this.getUnvan()+" "+this.getAdSoyad()+" "+this.getBolum()+" dersine girdi.");
    }
    
    
    
}
