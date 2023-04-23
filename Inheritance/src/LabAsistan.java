/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class LabAsistan extends Asistan {

    public LabAsistan(String bolum, String unvan, String telefon, String adSoyad, String eposta, String ofisSaati) {
        super(bolum, unvan, telefon, adSoyad, eposta, ofisSaati);
    }
    
    public void lablaraGir(){
        
        System.out.println(this.getAdSoyad()+" laba girdi.");
    }
    
    
}
