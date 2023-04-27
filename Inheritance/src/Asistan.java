
public class Asistan extends Akademisyen {
    
    private String ofisSaati;
    
    public Asistan(String bolum, String unvan, String telefon, String adSoyad, String eposta, String ofisSaati){
        super(bolum, unvan, telefon, adSoyad, eposta);
        
        this.ofisSaati = ofisSaati;
        
    }
    
    public String getOfisSaati(){
        
        return this.ofisSaati;
    }
    
    public void setOfisSaati(String ofisSaati){
        
        this.ofisSaati = ofisSaati;
    }
    
    public void quizYap(){
        
        System.out.println(this.getUnvan()+" "+this.getAdSoyad()+" quiz yaptı");
    }
    
    @Override
    public void DerseGir(){
        System.out.println(this.getUnvan()+" "+this.getAdSoyad()+" "+this.getBolum()+" dersine girdi.");
    }
}
