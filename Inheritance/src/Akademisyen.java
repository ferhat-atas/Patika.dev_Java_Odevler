
public abstract class  Akademisyen extends Calisan {
    
    private String bolum;
    private String unvan;

    public Akademisyen(String bolum, String unvan, String adSoyad, String telefon, String eposta) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    
    
    public abstract void DerseGir();
    
    @Override
    public void giris(){
        System.out.println("Akademisyen "+this.getAdSoyad()+" üniversiteye giriş yaptı.");
        
    }
    
}
