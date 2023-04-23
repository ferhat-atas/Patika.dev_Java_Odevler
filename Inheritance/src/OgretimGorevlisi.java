/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class OgretimGorevlisi extends Akademisyen {
    
    private String dersler;

    public OgretimGorevlisi(String dersler, String bolum, String unvan, String adSoyad, String telefon, String eposta) {
        super(bolum, unvan, adSoyad, telefon, eposta);
        this.dersler = dersler;
    }
    
    public void SenatoToplantisi(){
        
        System.out.println(this.getUnvan()+" "+this.getAdSoyad()+" senato toplantısına girdi.");
    }
    
}
