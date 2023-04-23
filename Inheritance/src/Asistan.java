/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
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
}
