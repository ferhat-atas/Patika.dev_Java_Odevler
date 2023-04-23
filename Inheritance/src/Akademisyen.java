/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class Akademisyen extends Calisan {
    
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
    
    
    public void DerseGir(){
        System.out.println(this.unvan+" "+this.getAdSoyad()+" "+this.bolum+" dersine girdi.");
    }
    
}
